## DSL for spring boot restful APIs generation ***ASAM DSL***
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
offers a unified approach for creating CRUD (Create, Read, Update, Delete) RESTful APIs with basic unit tests. Leveraging MDE methodologies the solution will enable  model-to-model 
transformations and model-to-text transformations.

### *ASAM DSL as dsl*
#### <h3 align="center">1- HIGH-LEVEL OVERVIEW</li></h1>
##### <li>DSL Input:

> Users input API configurations using a concise DSL syntax that defines entities,database connection properties  .\
##### <li> MetaModel Definition:
>The DSL processes the user input, creating an abstract model that accurately represents the structure and behavior of the desired API, including specified entities and operations.
>##### <li> Grammar building:
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







