[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/capcodigital/team-course">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">Team Course</h3>

  <p align="center">
    Basic introduction to technologies that are commonly used on client engagements
    <br />
    <a href="https://github.com/capcodigital/team-course/blob/master/documentation/README.md"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/capcodigital/team-course/issues">Report Bug</a>
    ·
    <a href="https://github.com/capcodigital/team-course/issues">Request Feature</a>
  </p>
</p>

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>

## About The Project

This repo holds the introductory Digital Engineering training course.  The purpose of the course is to provide a basic introduction to technologies that are commonly used on client engagements.

The course is not meant as an extensive training in the specific technologies, a list or resources have been curated that will be useful for that purpose, as have Udemy channels been setup aligned to the Engineering development paths.

### Built With

* [Java](https://www.java.com/en/)
* [NodeJS](https://nodejs.org/en/)
* [Gradle](https://gradle.org/)
* [Docker](https://www.docker.com/)
* [CircleCI](https://circleci.com/)
* [ElasticSearch](https://www.elastic.co/)
* [Kubernetes](https://kubernetes.io/)
* [Google Cloud Platform](https://cloud.google.com/)

<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

* Java 8-11 is required to build and run the application

### Installation

```shell
# clone the repo
git clone https://github.com/capcodigital/team-course.git

# create virtual environment
pyenv virtualenv 3.9.1 .venv-team-course

# installs the tooling requirements
pip install -r requirements.txt

# installs the git hook for pre-commit
pre-commit install
```

<!-- USAGE EXAMPLES -->
## Usage

### Starting MongoDB

To start up the required mongo database, run the following:

```shell
docker-compose -f stack.yml up -d if-db
```

### Pre-Requisite / Trouble Shooting

This repo is configured using gradlewrapper of 4.8 version.  However if you already have higher version of gradle, and if you attempt to run gradle commands instead of `./gradlew` command, you will see some errors like `Could not find method compile(), as its removed from latest gradle versions.`

Manage multiple version of gradle in your local machine checkout [sdkman](https://sdkman.io/).

This is version manager for many tools like gradle, groovy. Install it following the instructions and then it's pretty easy to use for macOS / Linux.

#### To check available versions

```shell
sdk list gradle
```

#### To install and user particular version

```shell
sdk install gradle 7.0
sdk use gradle 7.0
```

### Clean, Build & Run the Application

To clean, build and run the application execute the following command:

```shell
./gradlew clean build bootRun
```

### Running Application in Docker

To build the application as a docker file, run the following:

```shell
./gradlew docker
```

### Running Required Dependencies using Docker

To run the required dependencies using docker containers, run:

```shell
docker-compose -f stack.yml up -d
```

### Test Coverage Report

To generate a Jacoco test coverage report, run:

```shell
./gradlew clean check
```

The report can be viewed at:

```shell
/digital-engineering-course/build/reports/jacoco/test/html/index.html
```

### Running the Application

To run the application itself, run:

```shell
docker run -d -p 8090:8090 --name digitalengineeringcourse manucapco/digitalengineeringcourse:latest
```

You should be able to access the following page [here](http://localhost:8090/swagger-ui.html)

<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/capcodigital/team-course/issues) for a list of proposed features (and known issues).

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

If you would like to contribute to any Capco Digital OSS projects please read:

* [Code of Conduct](https://github.com/capcodigital/.github/blob/master/CODE_OF_CONDUCT.md)
* [Contributing Guidelines](https://github.com/capcodigital/.github/blob/master/CONTRIBUTING.md)

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.

<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements

* [Best README Template](https://github.com/othneildrew/Best-README-Template/blob/master/README.md)

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/capcodigital/team-course.svg?style=for-the-badge
[contributors-url]: https://github.com/capcodigital/team-course/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/capcodigital/team-course.svg?style=for-the-badge
[forks-url]: https://github.com/capcodigital/team-course/network/members
[stars-shield]: https://img.shields.io/github/stars/capcodigital/team-course.svg?style=for-the-badge
[stars-url]: https://github.com/capcodigital/team-course/stargazers
[issues-shield]: https://img.shields.io/github/issues/capcodigital/team-course.svg?style=for-the-badge
[issues-url]: https://github.com/capcodigital/team-course/issues
[license-shield]: https://img.shields.io/github/license/capcodigital/team-course.svg?style=for-the-badge
[license-url]: https://github.com/capcodigital/team-course/blob/master/LICENSE
