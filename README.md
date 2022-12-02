# k8s-poc-backend
POC project for Spring Boot backend application with Kubernetes deployment configuration.

## Run the application locally

* Run from the IDEA

* Run with maven

```
mvn spring-boot:run
```

* Run as a stand-alone packaged application

```
mvn clean package spring-boot:repackage

java -jar target/k8s-poc-backend-0.0.1-SNAPSHOT.jar
```

## Test the locally running application

Test the application by exercising the demo endpoint from Postman.

* Request:

```
GET 
http://localhost:8080/demo
```
* Response: 

```
200 OK
{
"title": "demo"
}

```
## Run locally on Kubernetes
