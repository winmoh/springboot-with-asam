## DSL for spring boot restful APIs generation ***ASAM DSL***
### *Introduction*
Model-Driven Engineering (MDE) is an approach to software development that emphasizes the use of models to design and implement systems. In MDE, abstract representations, or models, capture the essential aspects of a system, ranging from its structure to its behavior. These models serve as a foundation for generating executable code, documentation, and other artifacts, streamlining the development process and fostering higher-level abstractions. Domain-Specific Languages (DSLs) play a pivotal role in MDE, providing specialized, expressive syntax tailored to a particular problem domain. DSLs allow developers to articulate solutions in a language that closely aligns with the concepts of their specific application domain, enabling more intuitive and efficient development within that context. Together, MDE and DSLs contribute to increased productivity, code quality, and maintainability by promoting a model-centric and domain-specific approach to software engineering.
### *problem formalization*
Building spring boot applications is task that full stack and software developers do almost every day,
also these  applications have many similarities in terms of business logic,entities and also dependencies,other side most of the real world 
developed applications are built on the top of a basic crud architecture.Therefore,we thought that if the core of the majority of spring boot 
applications remains the same then a unified approach that a primitive spring boot ground containing the basics  restfull apis that provides 
the necessary logic for crud manipulations.

### *solution*
In our pursuit of formal tooling, we have identified that Model Driven Engineering (MDE) aligns well with the objectives of addressing the challenges 
faced by ASAM DSL. The aim of ASAM DSL is to streamline the development process by providing a high-level Domain-Specific Language (DSL) that reduces 
redundancy and simplifies the generation of basic code.
Under the umbrella of ASAM DSL, we propose an integrated solution employing Model Driven Engineering principles. This solution, also named ASAM DSL, 
offers a unified approach for creating CRUD (Create, Read, Update, Delete) RESTful APIs . Leveraging MDE methodologies the solution will enable  model-to-model 
transformations and model-to-text transformations.
ASAM solution is now on the beginning of the way as the objectives is tio cover many aspects of spring boot functionnalities and features.The first Version of ASAM is now targeting crud restfull apis in a monolyth architecture,but for sure the next versions would support :
##### <li> unit test
##### <li> integration tests
##### <li> batch processing 
##### <li> IAM(identity and access management ) 
##### <li> different software architectures(serverless,microservices,event-driven,Master-slave....)......



### *ASAM DSL as dsl/solution architecture*
#### <h3 align="center">1- HIGH-LEVEL OVERVIEW</li></h1>
##### <li>DSL Input:

> Users input API configurations using a concise DSL syntax that defines entities,database connection properties  .\
##### <li> MetaModel Definition:
>ASAM DSL allows the definition of Spring Boot RESTful APIs through a concise and expressive syntax. The DSL encompasses various aspects of API development, including project configuration, entity modeling, data transfer objects (DTOs), controllers, repositories, and custom actions.

>#### <li>Project Definition:
 Define a Spring Boot project using the 'project' keyword, specifying the project name ('nom') and optional configuration settings.
>##### <li>Entity Modeling:
  
  Entities are defined using the 'entity' keyword, specifying the entity name ('nom'), identifier details, properties, repository, and controller.
  ##### <li>Data Transfer Objects (DTOs):
  
  DTOs are defined using the 'dto' keyword, specifying the DTO name ('nom') and its properties.
  ##### <li>Controllers:
  
  Controllers are defined using the 'controller' keyword, allowing the specification of base URLs, custom actions, and CRUD operations.
  ##### <li>Custom Actions:
  
  Custom actions are defined using the 'service' keyword, providing details such as HTTP method, path, return type, implementation, and parameters.
  ##### <li>Repositories:
  
  Repositories are defined using the 'repository' keyword, encompassing custom query methods, 'find by' methods, and 'delete by' methods.
  ##### <li>Configuration:
  
  Configuration settings, including server and database details, are defined using the 'config' keyword.
  ##### <li>Data Types:
  
  Various data types, including primitive types and enumerations, are supported.
  ##### <li>Relationships:
  
  Entity relationships, such as Many-to-Many ('M2M'), Many-to-One ('M2O'), and One-to-Many ('O2M'), can be specified.
  ##### <li>HTTP Methods and Database Types:
  
  HTTP methods ('GET', 'POST', 'PUT', 'DELETE', 'PATCH') and database types (e.g., 'MYSQL', 'POSTGRES') are supported.
  ##### <li>Parameter Transfer Types:
  
  Different parameter transfer types, such as 'RequestBody', 'RequestParam', and 'PathVariable', are available for custom actions.
  ##### <li>Validation and Defaults:
  
  Validation constraints and default values for properties can be specified.
  
  The DSL aims to provide a declarative and intuitive syntax for describing the structure and behavior of Spring Boot RESTful APIs, facilitating rapid development and easy customization.


##### <li> Grammar building:
>The DSL processes the user input, creating an abstract model that accurately represents the structure and behavior of the desired API, including specified entities and operations.
##### <li>Validation:
>The abstract model undergoes a model-to-text transformation, where templates are used to generate text-based artifacts, such as Java code and configuration files.
##### <li>Generated Code:
>The output of the model-to-text transformation is the generation of source code for the CRUD operations, including controllers, data models, and repository interfaces.
##### <li>Unit Testing Generation:
>As part of the code generation process, ASAM DSL supports the generation of basic unit tests to ensure the functionality and integrity of the generated API code.
##### <li>Application.properties Configuration:
>Users can configure additional settings, such as database connections and logging levels, via an application.properties file.

#### <h3 align="center">2- THE TARGET ARCHITECTURE OF THE DSL</h1>
the objective of dsl wil be to generate a restful spring boot application that provides customized restful logic for crud operations.The generated  application 
will exposes REST resources from CRUD operations can be modelled as the one shown in Fig below that shows an example applied on an entity called order.

![target architecture](images/im1.JPG)

#### <h3 align="center">3-OBJECTIVES</h1>

the first version of ASAM DSL is restricted to crud manipulations restful apis in an MVC architecture with the necessary database configuration.This is
not the final point of the project ,next versions will surely take into consideration other types of api(caching ,fetching and cleaning ,security config  ......),
also it will take into consideration different types of architectures.So ,it is a matter of evolution and progress .

Introduction, problématique, Solution proposée, Architecture de la solution,Métamodèles choisies, transformations... et conclusion

### *Architecture de la solution*


### *Métamodèles choisies*


### *Transformations*


### *Conclusion*










