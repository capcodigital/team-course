# Container Integration with JDK 8 and JDK 10 Findings

The aim is to run a Spring Boot application in a container.

To understand the challenges using a different version of JDK, we should first understand what is a container and how they are built. Containers

## Containers

A container image is a lightweight, stand-alone, executable package of a piece of software that includes everything needed to run it: code, runtime, system tools, system libraries, settings. Containers are just isolated Linux process groups running on the same host machine(Linux kernel).

## How containers works

Containers are created as a separated process, each one of these containers are isolated into their environment. If we run multiple containers and look at the processes at our host machine, we will see all created containers as a child of ‘containerd process’.
But if we take a look at the processes inside of a single container, we can only see one process running as it isolated from other containers.
To understand how containers provide isolation.

* **cgroup**: Is a Linux kernel feature that limits, accounts for, and isolates the resource usage (CPU, memory, disk I/O, network, etc.) of a collection of processes, Control Groups provide a mechanism for aggregating/partitioning sets of tasks, and all their future children, into hierarchical groups with specialised behaviour.
* **namespace**: Are a feature of the Linux kernel that partitions kernel resources such that one set of processes sees one set of resources while another set of processes sees a different set of resources. The feature works by having the same namespace for these resources in the various sets of processes, but those names referring to distinct resources. Examples of resource names that can exist in multiple spaces, so that the named resources are partitioned, are process IDs, hostnames, user IDs, file names, and some names associated with network access, and interprocess communication. Where groups of processes are separated such that they cannot "see" resources in other groups. It wraps a global system resource in an abstraction that makes it appear to the processes within the namespace that they have their own isolated instance of the global resource.

In summary...

* cgroups = limits how much you can use
* namespaces = limits what you can see/use

These two Linux kernel features are utilised in pretty much by all containers technology to create and isolate containers as a separated process running in the same machine.

## Running container with JDK 8 or 9

Containerise an application using Java 8 is not an easy task, the behaviour of the application in different environments(testing, production, etc...) is different and unpredictable. Not even with version 9, JVM is not fully aware of the isolation mechanisms that containers are built around(Linux Kernel features)

Whenever I run the application in a container, I am going to get the total number of processors available on the system, or in the case of virtual machines, on the virtual system. The JVM looks at the overall host memory and uses that to set its defaults. The result is that the JVM ignores cgroups and that causes a performance

## JDK 10

Until recently, running the JVM in a container presented problems with memory and CPU sizing and usage that led to performance loss. This was because Java did not recognise memory or CPU limits, constraints set by control groups (cgroups). In Java 10, memory limits are automatically recognised and enforced.

## Testing with Java 8

1. Using a simple Spring Boot application that generates and adds to an Arraylist a 'new Long' object within an infinite loop, provoking the application to crash for lack of memory.
2. Generate a docker image of the application
3. Run the image as a container and limiting the memory to 150 with `-m` flag

### Java 8 Test Observation

The application container was instantaneously killed. And if we check the memory after been set, we can realise that the VM totally ignored the memory limit, instead, it used the default memory(1/4 of total memory)

## Testing with Java 10

Using the same Spring Boot application with an exception, instead of Java 8, this time we used Java 10.

### Java 10 Test Observation

In comparison with the previous test, now we can see that the memory limitation set by the '-m' flag was respected, the container is using around the same value (150)

## Conclusion

The previous version of Java 10 ignores all the constraints set by control groups (cgroups), and by using Java 10 we can be sure that the VM will automatically recognise the memory or CPU limits.
