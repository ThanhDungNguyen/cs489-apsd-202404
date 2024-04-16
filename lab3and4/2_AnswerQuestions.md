### What is Spring?

Spring is a framework which is used to simply the development of Java enterprise application.

### What is Spring Boot?

Spring Boot is built on top of Spring Framework. It makes it easy to create standalone, production ready, Spring based application.

### What is the relation between Spring platform and Spring Boot?

Spring Platform includes the Spring Framework and all other related projects and modules (such as Spring Boot, Spring Data, Spring Cloud) in the Spring ecosystem.

So, Spring Boot is a layer which is build on top of Spring Framework and help create Java application easily with production-ready configurations.

### What is the relation between Spring platform and Spring framework?

Spring Platform includes the Spring Framework and all other related projects and modules (such as Spring Boot, Spring Data, Spring Cloud) in the Spring ecosystem.

So, Spring Framework is the core of the Spring Platform and provide the fundamental functions and configuration for building the Java application.

### What is Dependency Injection and how is it done in the Spring platform/framework?

Dependency Injection is a process of injecting dependencies into a class instead of creating and managing dependencies by the class itself.

This can be done by using the Inversion of Control (IoC) container with following steps:

* Bean configuration by annotation or XML
* Setup the injection type (constructor injection, setter injection, field injection)
* IoC scans for the beans, injects into the objects and manage the lifecycle of the beans

### What is Inversion of Control (IoC) and how is it related to Spring?

Inversion of Control (IoC) refers to the process of inverting the control of objects creation and lifecycle management instead of letting the objects manage their dependencies by themselve.

In Spring Framework, IoC is implemented by Spring IoC container. Spring IoC is responsible for bean configurations, dependency injection and lifecycle management.