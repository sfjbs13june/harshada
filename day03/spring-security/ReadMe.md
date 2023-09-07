## Student protected url with spring security

### build application

    mvn clean install

## send request

    user username and password(user123,password)

## Send request

    curl --location --request GET 'http://localhost:8080/getstudent' --header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' 
    curl --location --request PUT 'http://localhost:8080/updatestudent' --header 'Authorization: YWRtaW4xMjM6cGFzc3dvcmQ='

### Create docker image

    mvn install dockerfile:build

## Run docker image

    docker run -p 8080:8080 harshada007/spring-security:1.0.0