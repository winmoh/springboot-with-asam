/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.asam.asam.Entity
import org.xtext.example.asam.asam.Sboot
import org.xtext.example.asam.asam.Type
import org.xtext.example.asam.asam.ListType
import org.xtext.example.asam.asam.SetType
import org.xtext.example.asam.asam.RType
import java.util.ArrayList
import org.xtext.example.asam.asam.Configuration
import org.xtext.example.asam.asam.DTO

/*import org.xtext.example.asam.asam.Type
import org.xtext.example.asam.asam.VTypes
import org.xtext.example.asam.asam.ListType*/

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AsamGenerator extends AbstractGenerator {

	
	override void beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        //val outputFolder = "src-gen/entities"; // Change this to your desired output folder
        //fsa.generateFile("entities/.gitkeep", "");
        //override void beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
       
    
    }
    
    
    
     
	//main fucntion for code generation
    override void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        input.allContents.forEach[ element |
            if (element instanceof Entity) {
            	val idField = if (element.nom !== null) {
			        'private ' + getSimpleTypeName(entity.Id.type) + ' ' + entity.id.nom + ';'
			    	} else {
			        'private int id;'
			    }
                generateEntityClass(element as Entity, fsa,input);
            }
        ]
        input.allContents.forEach[ element |
            if (element instanceof DTO) {
                generateDtoClass(element as DTO, fsa,input);
            }
        ]
		val projectNameHolder = new ArrayList<Configuration>()
    	input.allContents.forEach[element|
    		if(element instanceof Sboot){
 			projectNameHolder.add(element.configuration);    		}
    	]
    	val config=projectNameHolder.get(0)      
    	
    	 val projectNameH = new ArrayList<String>()
    	input.allContents.forEach[element|
    		if(element instanceof Sboot){
 			projectNameH.add(element.nom);    		}
    	]
    	val projectName=projectNameH.get(0)
        
        generateMainClass(fsa,input,config)
        generateMavenFiles(fsa,input)
        generateTestFolder(fsa,input)
        //val configuration = input.contents.filter(Configuration).head
       if (config!=null) {
        	
            generatePropertiesFile1(config, fsa)
            val dbmsType = config.database?.type?.toString ?: "mysql"
            
            switch(config.database.type){
            	case "h2":
                	generatePropertiesH2(config, fsa)
	            
	           	case "oracle":
	                generatePropertiesOracle(config, fsa)
	            	
	            default:
	            	generatePropertiesFile1(config,fsa)
            
        }}
        generatePomXml(config,fsa,projectName)
        
        
        
        
        
        
        
    }
    
    //hibernate dielect for .properties
    
    def getHibernateDialect(String dbmsType) {
	    switch (dbmsType) {
	        case "Mysql": return "org.hibernate.dialect.MySQL5Dialect"
	        case "Postgres": return "org.hibernate.dialect.PostgreSQLDialect"
	        case "Mariadb": return "org.hibernate.dialect.MariaDBDialect"
	        case "h2": return "org.hibernate.dialect.H2Dialect"
	        case "Oracle": return "org.hibernate.dialect.Oracle12cDialect"
	        // Add more cases for other supported databases
	        default: return "org.hibernate.dialect.MySQL5Dialect"
    }
}
	
	//pomxml generation
	def generatePomXml(Configuration config, IFileSystemAccess2 fsa,String prjName) {
        val pomContent = '''
            <?xml version="1.0" encoding="UTF-8"?>
            <project xmlns="http://maven.apache.org/POM/4.0.0"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
                <modelVersion>4.0.0</modelVersion>
                <parent>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-parent</artifactId>
                    <version>2.5.0</version> <!-- Use the latest version -->
                    <relativePath/> <!-- lookup parent from repository -->
                </parent>
                <groupId>com.springboot</groupId>
                <artifactId>«prjName»</artifactId>
                <version>0.0.1-SNAPSHOT</version>
                <name>«prjName»</name>
                <description>Demo project for Spring Boot</description>
                <properties>
                    <java.version>17</java.version>
                </properties>
                <dependencies>
                    <!-- Spring Boot Starter Dependencies -->
                    <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-data-jpa</artifactId>
                    </dependency>
                    <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-web</artifactId>
                    </dependency>
                    <dependency>
                        <groupId>org.projectlombok</groupId>
                        <artifactId>lombok</artifactId>
                        <optional>true</optional>
                    </dependency>
                    <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-test</artifactId>
                        <scope>test</scope>
                     </dependency>
                    
                    «generateDatabaseDependencies(config.database?.type.toString)»
                </dependencies>
                <build>
                    <plugins>
                      <plugin>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-maven-plugin</artifactId>
                        <configuration>
                          <excludes>
                            <exclude>
                              <groupId>org.projectlombok</groupId>
                              <artifactId>lombok</artifactId>
                            </exclude>
                          </excludes>
                        </configuration>
                      </plugin>
                    </plugins>
                  </build>
            </project>
        '''

        fsa.generateFile("pom.xml", pomContent)
    }
	
	//generating Database Dependencies
    def generateDatabaseDependencies(String dbmsType) {
        switch (dbmsType) {
            case "Mysql":
                return '''
                    <!-- MySQL Database Driver -->
                    <dependency>
                          <groupId>com.mysql</groupId>
                          <artifactId>mysql-connector-j</artifactId>
                          <scope>runtime</scope>
                        </dependency>
                '''
            case "Postgres":
                return '''
                    <!-- PostgreSQL Database Driver -->
                    <dependency>
                          <groupId>org.postgresql</groupId>
                          <artifactId>postgresql</artifactId>
                          <scope>runtime</scope>
                    </dependency>
                '''
                
            case "Mariadb":
                return '''
                    <!-- PostgreSQL Database Driver -->
                    <dependency>
                          <groupId>org.mariadb.jdbc</groupId>
                          <artifactId>mariadb-java-client</artifactId>
                          <scope>runtime</scope>
                        </dependency>
                '''
            
            case "Oracle":
                return '''
                    <!-- PostgreSQL Database Driver -->
				    <dependency>
				      <groupId>com.oracle.database.jdbc</groupId>
				      <artifactId>ojdbc11</artifactId>
				      <scope>runtime</scope>
				    </dependency>
                '''
              case "h2":
                return '''
                    <!-- PostgreSQL Database Driver -->
                     <dependency>
                          <groupId>com.h2database</groupId>
                          <artifactId>h2</artifactId>
                          <scope>runtime</scope>
                     </dependency>
                '''
            default:
                return ''
        }
    }
    
    
    
    
    def void generatePropertiesH2(Configuration config,IFileSystemAccess2 fsa){
    	val propertiesContent = '''
            # Server Configuration
            server.port = «(config.server== null || config.server.port==0) ? 8080:config.server.port»
            server.cpath = «config.server?.path ?: "/api"»

            # Database Configuration
            spring.datasource.url = jdbc:«config.database?.type?: "h2"»:mem:«config.database?.nom ?: "dbname"»
            spring.datasource.username = «config.database?.username ?: "root"»
            spring.datasource.password = «config.database?.password ?: "password"»

            # Hibernate Configuration
            spring.jpa.hibernate.ddl-auto = update
            spring.jpa.show-sql = true
            spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.«getHibernateDialect(config.database?.type.toString)»

            # Additional Hibernate Properties
            # Add any additional Hibernate properties as needed
        '''
    	val pomFilePath = "src/main/resources/application.properties"
        fsa.generateFile(pomFilePath, propertiesContent)
    }
    
    
    
    
    def void generatePropertiesOracle(Configuration config,IFileSystemAccess2 fsa){
    	val propertiesContent = '''
            # Server Configuration
            server.port = «(config.server== null || config.server.port==0) ? 8080:config.server.port»
            server.cpath = «config.server?.path ?: "/api"»

            # Database Configuration
            spring.datasource.url = jdbc:oracle:thin:@localhost:«(config.database==null || config.database.port==0 )? 1521:config.database.port»/«config.database?.nom ?: "dbname"»
            spring.datasource.username = «config.database?.username ?: "root"»
            spring.datasource.password = «config.database?.password ?: "password"»

            # Hibernate Configuration
            spring.jpa.hibernate.ddl-auto = update
            spring.jpa.show-sql = true
            spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.«getHibernateDialect(config.database?.type.toString)»

            # Additional Hibernate Properties
            # Add any additional Hibernate properties as needed
        '''
    	val pomFilePath = "src/main/resources/application.properties"
        fsa.generateFile(pomFilePath, propertiesContent)
    }
    
    
    def void generatePropertiesFile1(Configuration config,IFileSystemAccess2 fsa){
    	val propertiesContent = '''
            # Server Configuration
            server.port = «(config.server== null || config.server.port==0) ? 8080:config.server.port»
            server.cpath = «config.server?.path ?: "/api"»

            # Database Configuration
            spring.datasource.url = jdbc:«config.database?.type?: "mysql"»://localhost:«(config.database==null || config.database.port==0 )? 3306:config.database.port»/«config.database?.nom ?: "dbname"»
            spring.datasource.username = «config.database?.username ?: "root"»
            spring.datasource.password = «config.database?.password ?: "password"»

            # Hibernate Configuration
            spring.jpa.hibernate.ddl-auto = update
            spring.jpa.show-sql = true
            spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.«getHibernateDialect(config.database?.type.toString)»

            # Additional Hibernate Properties
            # Add any additional Hibernate properties as needed
        '''
         val pomFilePath = "src/main/resources/application.properties"
        fsa.generateFile(pomFilePath, propertiesContent)
        
    	
    }
    
    
    def void generateMavenFiles(IFileSystemAccess2 fsa, Resource input) {
        // Generate POM.xml
        val pomContent = '''
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.5/apache-maven-3.9.5-bin.zip
wrapperUrl=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar
        '''
        val pomFilePath = "mvn/wrapper/maven-wrapper.properties"
        fsa.generateFile(pomFilePath, pomContent)

       
       
    }
    
    
    
    
    
    
    
    def String extractVtypesValue(String typeString) {
	    // Get the string representation of TypeImpl
	    
	    // Split the string by whitespace and get the last part
	    val parts = typeString.split("\\s+")
		val vtypesPart = parts.last	
	    // Extract the content between the parentheses
	    return vtypesPart.substring(0, vtypesPart.length() - 1)
	}
	
	//generating test folder
	 
	
	def generateTestFolder(IFileSystemAccess2 fsa,Resource input){
		val projectNameHolder = new ArrayList<String>()
    	input.allContents.forEach[element|
    		if(element instanceof Sboot){
 			projectNameHolder.add(element.nom);    		}
    	]
    	val projectName=projectNameHolder.get(0)
			val content2= '''
    package com.springboot.«projectName»;

    import org.junit.jupiter.api.Test;
    import org.springframework.boot.test.context.SpringBootTest;

    @SpringBootTest
    class «projectName.toFirstUpper»ApplicationTests {
    
    	@Test
    	void contextLoads() {
    	}
    
    }
'''
	
	val fpath="src/test/java/com/springboot/"+projectName+"/"+projectName.toFirstUpper+"ApplicationTests.java"
	fsa.generateFile(fpath,content2)
		
	}
	
	
	
	//generating the static class
	def generateMainClass(IFileSystemAccess2 fsa,Resource input,Configuration configuration){
		val projectNameHolder = new ArrayList<String>()
    	input.allContents.forEach[element|
    		if(element instanceof Sboot){
 			projectNameHolder.add(element.nom);    		}
    	]
    	val projectName=projectNameHolder.get(0)
			val content2= '''
    package com.springboot.«projectName».«configuration.database.type»;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
    public class «projectName.toFirstUpper»Application {

        public static void main(String[] args) {
            SpringApplication.run(«projectName.toFirstUpper»Application.class, args);
        }
    }
'''
	
	val fpath="src/main/java/com/springboot/"+projectName+"/"+projectName.toFirstUpper+"Application.java"
	fsa.generateFile(fpath,content2)
		
	}





    
    def String getSimpleTypeName(Type type) {
	     if (type instanceof ListType) {
	        return "List<" + getSimpleTypeName(type.type) + ">"
	    } else if (type instanceof SetType) {
	        return "Set<" + getSimpleTypeName(type.type) + ">"
	    } else if (type instanceof RType) {
	        return type.vypes.toString
	    } else {
	        return extractVtypesValue(type.toString())
	    }
 }
 
 
 
 
 def generateDtoClass(DTO Dto, IFileSystemAccess2 fsa,Resource input) {
    	val projectNameHolder = new ArrayList<String>()
    	input.allContents.forEach[element|
    		if(element instanceof Sboot){
 			projectNameHolder.add(element.nom);    		}
    	]
    	val projectName=projectNameHolder.get(0)
        val className = Dto.nom;
        val properties = Dto.properties;
        

        val content = '''
    package com.springboot.«projectName».DTO;
    import lombok.*;
    import java.util.*;

    
    @Builder
    public class «className» {
        «FOR property : properties»
            private «getSimpleTypeName(property.type)» «property.nom»;
        «ENDFOR»

        «FOR property : properties»
            public «getSimpleTypeName(property.type)» get«property.nom.toFirstUpper»() {
                return «property.nom»;
            }

            public void set«property.nom.toFirstUpper»(«getSimpleTypeName(property.type)» «property.nom») {
                this.«property.nom» = «property.nom»;
            }
        «ENDFOR»
    }
''';
	

        val folderPath = "src/main/java/com/springboot/"+projectName+"/DTO";
        val filePath = folderPath + "/" + className + ".java";
        
        fsa.generateFile(filePath, content);
        
    }
 		
 		
 
 
 
	def generateEntityClass(Entity entity, IFileSystemAccess2 fsa,Resource input) {
    	val projectNameHolder = new ArrayList<String>()
    	input.allContents.forEach[element|
    		if(element instanceof Sboot){
 			projectNameHolder.add(element.nom);    		}
    	]
    	val projectName=projectNameHolder.get(0)
        val className = entity.nom;
        val properties = entity.properties;
        val extendsClause=entity.extends;
        

        val content = '''
    package com.springboot.«projectName».entities;

    import jakarta.persistence.Entity;
    import jakarta.persistence.Table;
     import lombok.*;
        import java.util.*;
    @Entity
    @Table(name = "«className»")
    @Builder
    public class «className» «IF extendsClause !== null»extends «extendsClause» «ENDIF»{
        «FOR property : properties»
            private «getSimpleTypeName(property.type)» «property.nom»;
        «ENDFOR»

        «FOR property : properties»
            public «getSimpleTypeName(property.type)» get«property.nom.toFirstUpper»() {
                return «property.nom»;
            }

            public void set«property.nom.toFirstUpper»(«getSimpleTypeName(property.type)» «property.nom») {
                this.«property.nom» = «property.nom»;
            }
        «ENDFOR»
    }
''';
	

        val folderPath = "src/main/java/com/springboot/"+projectName+"/entities";
        val filePath = folderPath + "/" + className + ".java";
        
        fsa.generateFile(filePath, content);
        
    }
}
