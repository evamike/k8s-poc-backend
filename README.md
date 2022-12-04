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
mvn clean package

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

* **Replace YOUR_DOCKERHUB_USERNAME with your Docker Hub username** in  
  * pom.xml  
  * k8s/k8s-poc-backend.yaml 
  * below in the login command

## Push to Docker hub

* login to Docker Hub for the push  

```
docker login -u YOUR_DOCKERHUB_USERNAME
```

* build docker image
* push to docker

```
mvn clean package docker:build docker:push
```

## Deploy to local kubernetes

* apply deployment

```
kubectl apply -f k8s/k8s-poc-backend.yaml
```

* use port forward to test the backend service running on kubernetes

```
kubectl port-forward service/k8s-poc-backend-service 8080:8080
```

* the application is now reachable from your machine on localhost  
* the test steps are the same as described in ``Test the locally running application``