# core-program1


This is a up and running boiler plate project. It will help us to workout below features and understand clearly. My intention is to not provide the implementations in this project.

* Softwares Used to develop this project:
	* Java 8 
	* Eclipse neon
	* Apache maven 3.5.0
	* Windows 10


#### *Please note that this project doesnot contain any implementation of below features, but it is a boiler plate project that provides you the platform to refresh your understanding of the features quickly. *

* How to setup a stand alone spring core application using Maven?

* What are the different types of Dependency Injections and how it works?

	* Setter Injection
	
	* Contructor Injection
	
	* Autowire
	
		* byName
		
		* byType
		
		* Constructor
		
		* Annotation
		
* How to access property files?

* How to create runnable jar?


### Useful details for this exercise:
To run a jar, create a runnable jar using eclipse. Then goto command prompt and use below command
```
java -jar createdJar.jar
```

Beans definition for beans.xml
```
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="
    http://www.springframework.org/schema/beans 
    http://www.springframework.org/schema/beans/spring-beans-4.3.xsd
	http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context-4.3.xsd
	">
```

Annotations

```
<context:annotation-config /> or <mvc:annotation-driven />
<context:component-scan base-package=""></context:component-scan>	
<context:property-placeholder location="classpath:application.properties"/>
```


