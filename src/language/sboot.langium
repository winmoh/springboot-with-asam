grammar Sboot





// Entry rule
entry Head:
    'poject' name=ID
    configuration=Configuration?
    elements+=Element*;

//project name could be specifid as an entry in the dsl

    

// Element types
Element:
    Entity | Service? | Controller | DTO? | Repository;

// Configuration
Configuration:
    'config' '{'
        server=ServerInfo?
        database=DatabaseInfo?
    '}';

ServerInfo:
    'server' '{'
        ('port' port=INT)?
        ('context-path' path=PATH)?
        
    '}';

DatabaseInfo:
    'database' '{'
        'url' url=STRING
        'username' username=STRING
        'password' password=STRING
        'DBMS' dbtype=RDBMS
        // Add more database-related properties as needed
    '}';

// Entity definitions
Entity:
    'data' name=ID ('inherits' extends=[Entity])? '{'
        properties+=Property*
    '}';

DTO:
    'dto' name=ID '{'
        properties+=Property*
    '}';

Service:
    'action' name=ID 'pertainingTo' entity=[Entity] '{'
        actions+=ServiceAction*
    '}';

Controller:
    'endpoint' name=ID 'mappingTo' entity=[Entity] '{'
        baseUrl=STRING?
        actions+=ControllerAction*
    '}';

Repository:
    'repository' name=ID 'for' entity=[Entity] '{'
        methods+=RepositoryMethod*
    '}';

// Repository methods
RepositoryMethod:
    FindByMethod | DeleteByMethod | CustomQueryMethod;

FindByMethod:
    'find' 'by' properties+=Property ('And' properties+=Property)*;

DeleteByMethod:
    'delete' 'by' properties+=Property;

CustomQueryMethod:
    'customQuery' '{' query=STRING '}';

// Service actions
ServiceAction:
    'operation' name=ID '{'
        'returns' returnType=Type
        ('raises' exceptionType=Type)?
        ('implementation' implementation=STRING)?
        ('params' parameters+=ActionParameter)*
    '}';

ControllerAction:
    method=HttpMethods 'action' name=ID '{'
        'linkedTo' serviceAction=[ServiceAction] 
        ('mappedAt' url=STRING)?
        parameters+=ActionParameter*
    '}';

// Additional definitions
ActionParameter:
    name=ID ':' type=Type ('default' defaultValue=STRING)?;

Property:
    name=ID ':' type=Type ('default' defaultValue=STRING)?;

Type:
    Primitives | ListType | SetType;

//PrimitiveType : 'string' | 'integer' | 'long' | 'boolean' | 'double';
ListType: 'List<' type=Type '>';
SetType: 'Set<' type=Type '>';

/*enum HttpMethod {
    GET : 'GET',
    POST : 'POST',
    PUT :'PUT',
    DELETE : 'DELETE';
}*/
// Terminal rules
terminal ID: /[_a-zA-Z][_a-zA-Z0-9]*/;
terminal INT: /[0-9]+/;
terminal STRING: /"[^"]*"/;
terminal PATH: /\/[a-zA-Z0-9_\-\/]+/;
terminal RDBMS returns string :/Mysql|Postgres|Mariadb|H2|Oracle|SQLite/;
terminal HttpMethods returns string :/GET|POST|DELETE|PUT|PATCH/;
terminal Primitives returns string :/Float|Int|Boulean|Char|Byte/;

//terminal ignored while parsing
hidden terminal WS: /\s+/;
hidden terminal ML_COMMENT: /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT: /\/\/[^\n\r]*/;