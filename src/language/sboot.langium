grammar Sboot // You should give a name to your grammar

// Entry rule
entry Head:
    'project' name=ID
    configuration=Configuration?
    (elements+=Element)*;

// Element types
Element:
    Entity | Service | Controller | DTO | Repository;

// Configuration
Configuration:
    'config' '{'
        server=ServerInfo?
        database=DatabaseInfo?
    '}';

ServerInfo:
    'server' '{'
        ('port' port=INT)?
        ('cpath' path=PATH)?
    '}';

DatabaseInfo:
    'database' '{'
        'dbms' type=RDBMS
        'dname' name=ID
        'dport' port=INT
        'username' username=ID
        'password' password=ID
        
    '}';

// Entity definitions
Entity:
    'entity' name=ID ('inherits' extends=[Entity])? '{'
        properties+=Property*
    '}';

DTO:
    'dto' name=ID '{'
        properties+=Property*
    '}';

Service:
    'service' name=ID 'pertainingTo' entity=[Entity] '{'
        actions+=ServiceAction*
    '}';

Controller:
    'controller' name=ID 'mappingTo' entity=[Entity] '{'
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
    VTypes | ListType | SetType;

// PrimitiveType corrections

ListType: 'List<' type=Type '>';
SetType: 'Set<' type=Type '>';




// Terminal rules
terminal ID: /[_a-zA-Z][_a-zA-Z0-9]*/;
terminal INT: /[0-9]+/;
terminal STRING: /"[^"]*"/;
terminal PATH: /\/[a-zA-Z0-9_\-\/]+/;

//VTypes is an attribute that would conatain the type of each attribute f our entities:/Double|Long|Float|Int|Boolean|Char|Byte|String/;


type VTypes = 'Float' | 'Long' | 'Integer' | 'Char' | 'Boolean'| 'Byte';
VTypes returns VTypes:
	Val1 |  Val2 |Val3 |Val4 |Val5 |Val6  ;
Val1 returns string: 'Float';
Val2 returns string: 'Long';
Val3 returns string: 'Integer';
Val4 returns string:'Char';
Val5 returns string: 'Boolean';
Val6 returns string: 'Byte';


// HttpMethods =/G=GET|P2=PUT|D=DELETE|P1=POST|P3=PATCH/;
type HttpMethods = 'Get' | 'Delete' | 'Post' | 'Put' | 'Patch';
HttpMethods returns HttpMethods:
	GET | POST | PUT |PATCH |DELETE ;
GET returns string: 'Get';
DELETE returns string: 'Delete';
POST returns string: 'Post';
PUT returns string:'Put';
PATCH returns string: 'Patch';

//DATABASE TYPES  THAT CAN BE ASSIGNED TO THE PROJECT
type RDBMS = 'Mysql' | 'Postgres' | 'Mariadb' | 'h2' | 'Oracle';
RDBMS returns RDBMS:
	POSTGRES | MYSQL | MARIADB |H2 |ORACLE |H2;
POSTGRES returns string: 'Postgres';
MARIADB returns string: 'Mariadb';
MYSQL returns string: 'Mysql';
ORACLE returns string:'Oracle';
H2 returns string: 'h2';
// Ignored terminals
hidden terminal WS: /\s+/;
hidden terminal ML_COMMENT: /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT: /\/\/[^\n\r]*/;