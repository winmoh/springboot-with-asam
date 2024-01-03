/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.asam.asam.Configuration;
import org.xtext.example.asam.asam.DatabaseInfo;
import org.xtext.example.asam.asam.Entity;
import org.xtext.example.asam.asam.ListType;
import org.xtext.example.asam.asam.Property;
import org.xtext.example.asam.asam.RDBMS;
import org.xtext.example.asam.asam.RType;
import org.xtext.example.asam.asam.Sboot;
import org.xtext.example.asam.asam.ServerInfo;
import org.xtext.example.asam.asam.SetType;
import org.xtext.example.asam.asam.Type;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class AsamGenerator extends AbstractGenerator {
  @Override
  public void beforeGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }

  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Procedure1<EObject> _function = (EObject element) -> {
      if ((element instanceof Entity)) {
        this.generateEntityClass(((Entity) element), fsa, input);
      }
    };
    IteratorExtensions.<EObject>forEach(input.getAllContents(), _function);
    this.generateMainClass(fsa, input);
    this.generateMavenFiles(fsa, input);
    this.generateTestFolder(fsa, input);
    final Configuration configuration = IterableExtensions.<Configuration>head(Iterables.<Configuration>filter(input.getContents(), Configuration.class));
    if ((configuration != null)) {
      this.generatePropertiesFile1(configuration, fsa);
      String _elvis = null;
      DatabaseInfo _database = configuration.getDatabase();
      RDBMS _type = null;
      if (_database!=null) {
        _type=_database.getType();
      }
      String _string = null;
      if (_type!=null) {
        _string=_type.toString();
      }
      if (_string != null) {
        _elvis = _string;
      } else {
        _elvis = "mysql";
      }
      final String dbmsType = _elvis;
      if (dbmsType != null) {
        switch (dbmsType) {
          case "h2":
            this.generatePropertiesH2(configuration, fsa);
            break;
          case "oracle":
            this.generatePropertiesOracle(configuration, fsa);
            break;
          default:
            this.generatePropertiesFile1(configuration, fsa);
            break;
        }
      } else {
        this.generatePropertiesFile1(configuration, fsa);
      }
    }
  }

  public String getHibernateDialect(final String dbmsType) {
    if (dbmsType != null) {
      switch (dbmsType) {
        case "MYSQL":
          return "org.hibernate.dialect.MySQL5Dialect";
        case "POSTGRES":
          return "org.hibernate.dialect.PostgreSQLDialect";
        case "MARIADB":
          return "org.hibernate.dialect.MariaDBDialect";
        case "H2":
          return "org.hibernate.dialect.H2Dialect";
        case "ORACLE":
          return "org.hibernate.dialect.Oracle12cDialect";
        default:
          return "org.hibernate.dialect.MySQL5Dialect";
      }
    } else {
      return "org.hibernate.dialect.MySQL5Dialect";
    }
  }

  public void generatePropertiesH2(final Configuration config, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Server Configuration");
    _builder.newLine();
    _builder.append("server.port = ");
    int _xifexpression = (int) 0;
    if ((Objects.equal(config.getServer(), null) || (config.getServer().getPort() == 0))) {
      _xifexpression = 8080;
    } else {
      _xifexpression = config.getServer().getPort();
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    _builder.append("server.cpath = ");
    String _elvis = null;
    ServerInfo _server = config.getServer();
    String _path = null;
    if (_server!=null) {
      _path=_server.getPath();
    }
    if (_path != null) {
      _elvis = _path;
    } else {
      _elvis = "/api";
    }
    _builder.append(_elvis);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Database Configuration");
    _builder.newLine();
    _builder.append("spring.datasource.url = jdbc:");
    Object _elvis_1 = null;
    DatabaseInfo _database = config.getDatabase();
    RDBMS _type = null;
    if (_database!=null) {
      _type=_database.getType();
    }
    if (_type != null) {
      _elvis_1 = _type;
    } else {
      _elvis_1 = "h2";
    }
    _builder.append(((Object)_elvis_1));
    _builder.append(":mem:");
    String _elvis_2 = null;
    DatabaseInfo _database_1 = config.getDatabase();
    String _nom = null;
    if (_database_1!=null) {
      _nom=_database_1.getNom();
    }
    if (_nom != null) {
      _elvis_2 = _nom;
    } else {
      _elvis_2 = "dbname";
    }
    _builder.append(_elvis_2);
    _builder.newLineIfNotEmpty();
    _builder.append("spring.datasource.username = ");
    String _elvis_3 = null;
    DatabaseInfo _database_2 = config.getDatabase();
    String _username = null;
    if (_database_2!=null) {
      _username=_database_2.getUsername();
    }
    if (_username != null) {
      _elvis_3 = _username;
    } else {
      _elvis_3 = "root";
    }
    _builder.append(_elvis_3);
    _builder.newLineIfNotEmpty();
    _builder.append("spring.datasource.password = ");
    String _elvis_4 = null;
    DatabaseInfo _database_3 = config.getDatabase();
    String _password = null;
    if (_database_3!=null) {
      _password=_database_3.getPassword();
    }
    if (_password != null) {
      _elvis_4 = _password;
    } else {
      _elvis_4 = "password";
    }
    _builder.append(_elvis_4);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Hibernate Configuration");
    _builder.newLine();
    _builder.append("spring.jpa.hibernate.ddl-auto = update");
    _builder.newLine();
    _builder.append("spring.jpa.show-sql = true");
    _builder.newLine();
    _builder.append("spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.");
    DatabaseInfo _database_4 = config.getDatabase();
    RDBMS _type_1 = null;
    if (_database_4!=null) {
      _type_1=_database_4.getType();
    }
    String _hibernateDialect = this.getHibernateDialect(_type_1.toString());
    _builder.append(_hibernateDialect);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Additional Hibernate Properties");
    _builder.newLine();
    _builder.append("# Add any additional Hibernate properties as needed");
    _builder.newLine();
    final String propertiesContent = _builder.toString();
    final String pomFilePath = "src/main/resources/application.properties";
    fsa.generateFile(pomFilePath, propertiesContent);
  }

  public void generatePropertiesOracle(final Configuration config, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Server Configuration");
    _builder.newLine();
    _builder.append("server.port = ");
    int _xifexpression = (int) 0;
    if ((Objects.equal(config.getServer(), null) || (config.getServer().getPort() == 0))) {
      _xifexpression = 8080;
    } else {
      _xifexpression = config.getServer().getPort();
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    _builder.append("server.cpath = ");
    String _elvis = null;
    ServerInfo _server = config.getServer();
    String _path = null;
    if (_server!=null) {
      _path=_server.getPath();
    }
    if (_path != null) {
      _elvis = _path;
    } else {
      _elvis = "/api";
    }
    _builder.append(_elvis);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Database Configuration");
    _builder.newLine();
    _builder.append("spring.datasource.url = jdbc:oracle:thin:@localhost:");
    int _xifexpression_1 = (int) 0;
    if ((Objects.equal(config.getDatabase(), null) || (config.getDatabase().getPort() == 0))) {
      _xifexpression_1 = 1521;
    } else {
      _xifexpression_1 = config.getDatabase().getPort();
    }
    _builder.append(_xifexpression_1);
    _builder.append("/");
    String _elvis_1 = null;
    DatabaseInfo _database = config.getDatabase();
    String _nom = null;
    if (_database!=null) {
      _nom=_database.getNom();
    }
    if (_nom != null) {
      _elvis_1 = _nom;
    } else {
      _elvis_1 = "dbname";
    }
    _builder.append(_elvis_1);
    _builder.newLineIfNotEmpty();
    _builder.append("spring.datasource.username = ");
    String _elvis_2 = null;
    DatabaseInfo _database_1 = config.getDatabase();
    String _username = null;
    if (_database_1!=null) {
      _username=_database_1.getUsername();
    }
    if (_username != null) {
      _elvis_2 = _username;
    } else {
      _elvis_2 = "root";
    }
    _builder.append(_elvis_2);
    _builder.newLineIfNotEmpty();
    _builder.append("spring.datasource.password = ");
    String _elvis_3 = null;
    DatabaseInfo _database_2 = config.getDatabase();
    String _password = null;
    if (_database_2!=null) {
      _password=_database_2.getPassword();
    }
    if (_password != null) {
      _elvis_3 = _password;
    } else {
      _elvis_3 = "password";
    }
    _builder.append(_elvis_3);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Hibernate Configuration");
    _builder.newLine();
    _builder.append("spring.jpa.hibernate.ddl-auto = update");
    _builder.newLine();
    _builder.append("spring.jpa.show-sql = true");
    _builder.newLine();
    _builder.append("spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.");
    DatabaseInfo _database_3 = config.getDatabase();
    RDBMS _type = null;
    if (_database_3!=null) {
      _type=_database_3.getType();
    }
    String _hibernateDialect = this.getHibernateDialect(_type.toString());
    _builder.append(_hibernateDialect);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Additional Hibernate Properties");
    _builder.newLine();
    _builder.append("# Add any additional Hibernate properties as needed");
    _builder.newLine();
    final String propertiesContent = _builder.toString();
    final String pomFilePath = "src/main/resources/application.properties";
    fsa.generateFile(pomFilePath, propertiesContent);
  }

  public void generatePropertiesFile1(final Configuration config, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Server Configuration");
    _builder.newLine();
    _builder.append("server.port = ");
    int _xifexpression = (int) 0;
    if ((Objects.equal(config.getServer(), null) || (config.getServer().getPort() == 0))) {
      _xifexpression = 8080;
    } else {
      _xifexpression = config.getServer().getPort();
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    _builder.append("server.cpath = ");
    String _elvis = null;
    ServerInfo _server = config.getServer();
    String _path = null;
    if (_server!=null) {
      _path=_server.getPath();
    }
    if (_path != null) {
      _elvis = _path;
    } else {
      _elvis = "/api";
    }
    _builder.append(_elvis);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Database Configuration");
    _builder.newLine();
    _builder.append("spring.datasource.url = jdbc:");
    Object _elvis_1 = null;
    DatabaseInfo _database = config.getDatabase();
    RDBMS _type = null;
    if (_database!=null) {
      _type=_database.getType();
    }
    if (_type != null) {
      _elvis_1 = _type;
    } else {
      _elvis_1 = "mysql";
    }
    _builder.append(((Object)_elvis_1));
    _builder.append("://localhost:");
    int _xifexpression_1 = (int) 0;
    if ((Objects.equal(config.getDatabase(), null) || (config.getDatabase().getPort() == 0))) {
      _xifexpression_1 = 3306;
    } else {
      _xifexpression_1 = config.getDatabase().getPort();
    }
    _builder.append(_xifexpression_1);
    _builder.append("/");
    String _elvis_2 = null;
    DatabaseInfo _database_1 = config.getDatabase();
    String _nom = null;
    if (_database_1!=null) {
      _nom=_database_1.getNom();
    }
    if (_nom != null) {
      _elvis_2 = _nom;
    } else {
      _elvis_2 = "dbname";
    }
    _builder.append(_elvis_2);
    _builder.newLineIfNotEmpty();
    _builder.append("spring.datasource.username = ");
    String _elvis_3 = null;
    DatabaseInfo _database_2 = config.getDatabase();
    String _username = null;
    if (_database_2!=null) {
      _username=_database_2.getUsername();
    }
    if (_username != null) {
      _elvis_3 = _username;
    } else {
      _elvis_3 = "root";
    }
    _builder.append(_elvis_3);
    _builder.newLineIfNotEmpty();
    _builder.append("spring.datasource.password = ");
    String _elvis_4 = null;
    DatabaseInfo _database_3 = config.getDatabase();
    String _password = null;
    if (_database_3!=null) {
      _password=_database_3.getPassword();
    }
    if (_password != null) {
      _elvis_4 = _password;
    } else {
      _elvis_4 = "password";
    }
    _builder.append(_elvis_4);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Hibernate Configuration");
    _builder.newLine();
    _builder.append("spring.jpa.hibernate.ddl-auto = update");
    _builder.newLine();
    _builder.append("spring.jpa.show-sql = true");
    _builder.newLine();
    _builder.append("spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.");
    DatabaseInfo _database_4 = config.getDatabase();
    RDBMS _type_1 = null;
    if (_database_4!=null) {
      _type_1=_database_4.getType();
    }
    String _hibernateDialect = this.getHibernateDialect(_type_1.toString());
    _builder.append(_hibernateDialect);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Additional Hibernate Properties");
    _builder.newLine();
    _builder.append("# Add any additional Hibernate properties as needed");
    _builder.newLine();
    final String propertiesContent = _builder.toString();
    final String pomFilePath = "src/main/resources/application.properties";
    fsa.generateFile(pomFilePath, propertiesContent);
  }

  public void generateMavenFiles(final IFileSystemAccess2 fsa, final Resource input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.5/apache-maven-3.9.5-bin.zip");
    _builder.newLine();
    _builder.append("wrapperUrl=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar");
    _builder.newLine();
    final String pomContent = _builder.toString();
    final String pomFilePath = "mvn/wrapper/maven-wrapper.properties";
    fsa.generateFile(pomFilePath, pomContent);
  }

  public String extractVtypesValue(final String typeString) {
    final String[] parts = typeString.split("\\s+");
    final String vtypesPart = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(parts)));
    int _length = vtypesPart.length();
    int _minus = (_length - 1);
    return vtypesPart.substring(0, _minus);
  }

  public void generateTestFolder(final IFileSystemAccess2 fsa, final Resource input) {
    final ArrayList<String> projectNameHolder = new ArrayList<String>();
    final Procedure1<EObject> _function = (EObject element) -> {
      if ((element instanceof Sboot)) {
        projectNameHolder.add(((Sboot)element).getNom());
      }
    };
    IteratorExtensions.<EObject>forEach(input.getAllContents(), _function);
    final String projectName = projectNameHolder.get(0);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.springboot.");
    _builder.append(projectName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.junit.jupiter.api.Test;");
    _builder.newLine();
    _builder.append("import org.springframework.boot.test.context.SpringBootTest;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@SpringBootTest");
    _builder.newLine();
    _builder.append("class ");
    String _firstUpper = StringExtensions.toFirstUpper(projectName);
    _builder.append(_firstUpper);
    _builder.append("ApplicationTests {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Test");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void contextLoads() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String content2 = _builder.toString();
    String _firstUpper_1 = StringExtensions.toFirstUpper(projectName);
    String _plus = ((("src/test/java/com/springboot/" + projectName) + "/") + _firstUpper_1);
    final String fpath = (_plus + "ApplicationTests.java");
    fsa.generateFile(fpath, content2);
  }

  public void generateMainClass(final IFileSystemAccess2 fsa, final Resource input) {
    final ArrayList<String> projectNameHolder = new ArrayList<String>();
    final Procedure1<EObject> _function = (EObject element) -> {
      if ((element instanceof Sboot)) {
        projectNameHolder.add(((Sboot)element).getNom());
      }
    };
    IteratorExtensions.<EObject>forEach(input.getAllContents(), _function);
    final String projectName = projectNameHolder.get(0);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.springboot.");
    _builder.append(projectName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.boot.SpringApplication;");
    _builder.newLine();
    _builder.append("import org.springframework.boot.autoconfigure.SpringBootApplication;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@SpringBootApplication");
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(projectName);
    _builder.append(_firstUpper);
    _builder.append("Application {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("SpringApplication.run(");
    String _firstUpper_1 = StringExtensions.toFirstUpper(projectName);
    _builder.append(_firstUpper_1, "        ");
    _builder.append("Application.class, args);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String content2 = _builder.toString();
    String _firstUpper_2 = StringExtensions.toFirstUpper(projectName);
    String _plus = ((("src/main/java/com/springboot/" + projectName) + "/") + _firstUpper_2);
    final String fpath = (_plus + "Application.java");
    fsa.generateFile(fpath, content2);
  }

  public String getSimpleTypeName(final Type type) {
    if ((type instanceof ListType)) {
      String _simpleTypeName = this.getSimpleTypeName(((ListType)type).getType());
      String _plus = ("List<" + _simpleTypeName);
      return (_plus + ">");
    } else {
      if ((type instanceof SetType)) {
        String _simpleTypeName_1 = this.getSimpleTypeName(((SetType)type).getType());
        String _plus_1 = ("Set<" + _simpleTypeName_1);
        return (_plus_1 + ">");
      } else {
        if ((type instanceof RType)) {
          return ((RType)type).getVypes().toString();
        } else {
          return this.extractVtypesValue(type.toString());
        }
      }
    }
  }

  public void generateEntityClass(final Entity entity, final IFileSystemAccess2 fsa, final Resource input) {
    final ArrayList<String> projectNameHolder = new ArrayList<String>();
    final Procedure1<EObject> _function = (EObject element) -> {
      if ((element instanceof Sboot)) {
        projectNameHolder.add(((Sboot)element).getNom());
      }
    };
    IteratorExtensions.<EObject>forEach(input.getAllContents(), _function);
    final String projectName = projectNameHolder.get(0);
    final String className = entity.getNom();
    final EList<Property> properties = entity.getProperties();
    final Entity extendsClause = entity.getExtends();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.springboot.");
    _builder.append(projectName);
    _builder.append(".entities;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import jakarta.persistence.Entity;");
    _builder.newLine();
    _builder.append("import jakarta.persistence.Table;");
    _builder.newLine();
    _builder.append("import lombok.Builder;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name = \"");
    _builder.append(className);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("@Builder");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" ");
    {
      if ((extendsClause != null)) {
        _builder.append("extends ");
        _builder.append(extendsClause);
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      for(final Property property : properties) {
        _builder.append("    ");
        _builder.append("private ");
        String _simpleTypeName = this.getSimpleTypeName(property.getType());
        _builder.append(_simpleTypeName, "    ");
        _builder.append(" ");
        String _nom = property.getNom();
        _builder.append(_nom, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      for(final Property property_1 : properties) {
        _builder.append("    ");
        _builder.append("public ");
        String _simpleTypeName_1 = this.getSimpleTypeName(property_1.getType());
        _builder.append(_simpleTypeName_1, "    ");
        _builder.append(" get");
        String _firstUpper = StringExtensions.toFirstUpper(property_1.getNom());
        _builder.append(_firstUpper, "    ");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return ");
        String _nom_1 = property_1.getNom();
        _builder.append(_nom_1, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public void set");
        String _firstUpper_1 = StringExtensions.toFirstUpper(property_1.getNom());
        _builder.append(_firstUpper_1, "    ");
        _builder.append("(");
        String _simpleTypeName_2 = this.getSimpleTypeName(property_1.getType());
        _builder.append(_simpleTypeName_2, "    ");
        _builder.append(" ");
        String _nom_2 = property_1.getNom();
        _builder.append(_nom_2, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("this.");
        String _nom_3 = property_1.getNom();
        _builder.append(_nom_3, "        ");
        _builder.append(" = ");
        String _nom_4 = property_1.getNom();
        _builder.append(_nom_4, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    final String content = _builder.toString();
    final String folderPath = (("src/main/java/com/springboot/" + projectName) + "/entities");
    final String filePath = (((folderPath + "/") + className) + ".java");
    fsa.generateFile(filePath, content);
  }
}
