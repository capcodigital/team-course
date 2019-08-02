# Digital Engineer Induction Course

# Introduction

The purpose of this space is to give an introductory course to Capco Digital Engineers. It is designed so that new and established engineers can be given some pre-defined tasks which will allow new joiners to get familiar with the technology, standards and practices and training that are used and available to us at Capco. The course will be split into development and training tasks. 

If you complete all of the tasks, you will have covered:

-   Creating a Node.js Express REST application.
-   Documentation of your REST API.
-   Persisting data in a Mongo Database and will correctly handle exceptions.
-   Code will be stored in the git source control system, automatically build and uploaded as a Docker container.
-   Log files will be written to an Elastic Search (ELK) instance.
-   The application will write messages to a Kafka event stream "Topic".
-   All of this will be hosted on a Kubernetes cluster on the Google Cloud Platform and will be highly scalable.

# Notes

-   Strongly advise reading all steps before starting the induction. Future steps may change the way you complete certain tasks along the way.

# Development Tasks

The development tasks are designed to be small units of work that a new joiner can research and complete individually or collaborate with other colleagues.

|     |                                                                                                               |                                                                  |
|-----|---------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------|
| No. | Task                                                                                                          | Description                                                      |
| 0   | [Recommended Topics ](Recommended_Topics.md) | Suggested topics to get familiar with some of the basic concepts |
| 1   | [NodeJs Express App](nodejs_express_app.md)      | Create a Node.js Express application with a single RESTful endpoint. |
| 2   | [Docker ](Docker.md)                          | Put the application into a Docker container                      |
| 3   | [API Documentation ](API_Documentation.md)    | Add automatic generation of API documentation e.g. Swagger       |
| 4   | [MongoDB ](MongoDB.md)                        | Add a mongo database to your application                         |
| 5   | [Testing ](Testing.md)                        | Create unit and integration tests for your application.          |
| 6   | [GET/POST data from MongoDB ](GET_POST_data_from_MongoDB.md)             | Create 2 new endpoints which read/write data to the MongoDB      |
| 7   | [Error Handling ](Error_Handling.md)          | REST response codes                                              |
| 8   | [Logging ](Logging.md)                        | Implement logging on your application                            |
| 9   | [Advanced Logging ](Advanced_Logging.md)      | ELK implementation                                               |
| 10  | [Source Control ](Source_Control.md)          | Storing your code in git                                         |
| 11  | [CI](CI_CD_Pipeline.md)                                                                                          | Continuous Integration - automatic build of your code            |
| 12  | [Docker Hub Container](Docker_Hub_Container.md)                                                                  | Create a container on Docker Hub                                 |
| 13  | [Container Orchestration](Container_Orchestration.md)                                                            | Deploy to the cloud and make your code scalable using Kubernetes |
| 14  | [Stream Processing](Stream_Processing.md)                                                                        | Kafka processing                                                 |
| 15  | [Full Kubernetes Deployment](Full_Kubernetes_Deployment.md)                                                      | Deploy App, Mongo, Kafka and ELK to Kubernetes                   |

## PluralSight Courses

The following are suggested reading topics to allow you to complete the development tasks.


-   [Node.js Getting started](https://app.pluralsight.com/library/courses/nodejs-getting-started)
-   [Node.js API Express & Mongo](https://app.pluralsight.com/library/courses/api-design-nodejs-express-mongo)
-   [Node Mocha](https://app.pluralsight.com/library/courses/mocha-javascript-testing-nodejs)
-   [MongoDB](https://app.pluralsight.com/library/courses/mongodb-introduction)
-   [Docker](https://app.pluralsight.com/library/courses/docker-getting-started/table-of-contents)
-   [ElasticSearch](https://app.pluralsight.com/library/courses/elasticsearch-analyzing-data/table-of-contents)
-   [Kubernetes (K8s)](https://app.pluralsight.com/library/courses/getting-started-kubernetes/table-of-contents)
