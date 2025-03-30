# BtgChallenge solution

The challenge can be found [HERE](https://github.com/buildrun-tech/buildrun-desafio-backend-btg-pactual/blob/main/problem.md)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=Spring&logoColor=white) ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white) ![Mongo](https://img.shields.io/badge/-MongoDB-13aa52?style=for-the-badge&logo=mongodb&logoColor=white) ![RabbitMQ](https://img.shields.io/badge/Rabbitmq-FF6600?style=for-the-badge&logo=rabbitmq&logoColor=white)

## Installation
Prerequisites:
* [Docker Installed](https://docs.docker.com/get-started/get-docker/)
* [Docker Compose Installed](https://docs.docker.com/compose/install/)

## Usage
Inside the project folder run:
```bash
docker compose up --build
```
When the containers are up, run:
```bash
mvn spring-boot:run
```

## Swagger Documentation
The Swagger documentation can be found at http://localhost:8080/swagger-ui/index.html
## RabbitMQ
RabbitMQ dashboard can be found at http://localhost:15672/

Considerations:
- Credentials are hardcoded for simplicity
  
