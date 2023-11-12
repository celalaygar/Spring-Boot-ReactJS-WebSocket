# Spring-Boot-ReactJS-WebSocket

#### Backend
There are several ways to run a Spring Boot application on your local machine. 

One way is to execute the `main` method in the `com.example.demo.FirstAppApplication` class from your IDE .

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

### Frontend
to run frontend first install `sockjs-client, stompjs, web-vitals` 
```
npm i sockjs-client
npm i stompjs
npm i web-vitals
npm start
```
After starting Frontend if you see this problem ` Module not found: Error: Can't resolve 'net' in 'node_modules/stompjs/lib'` you need to type this code on terminal
```
npm i net -S
```
for this problem Reference link: 
https://stackoverflow.com/questions/54275069/module-not-found-error-cant-resolve-net-in-node-modules-stompjs-lib
