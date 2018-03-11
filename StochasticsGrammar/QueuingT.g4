/**
 * Define a grammar called Hello
 */

grammar QueuingT;

//Composicion
codigo : (head) (network_description) (footer);

head   : var EQ INT;

var: NODES;

network_description : (node_description | connection)*;

node_description : DESNODO ABR_CC (node_property)* CRR_CC;

node_property : property EQ VAL;

connection : CONEX ABR_CC (id_con)+ CRR_CC;

id_con : (ATRIDS | ATRIDE) EQ (ID | INT);

footer : stime (analitics)*;

stime : SIM EQ (ID | INT);

analitics : 'avg_customer_system'
          | 'avg_customer_queue'
          | 'avgt_customer_system'
          | 'avgt_customer_queue';
                    
property : 'id'
         | 'id_start'
         | 'id_end'
         | 'number_of_servers'
         | 'queue_distribution'
         | 'server_distribution';
                    
VAL : INT
    | DIST
    | ID;
        

/*		
 * ---- LEXER ----
 */				
 
// Corchetes cuadrados
ABR_CC	: '[';
CRR_CC	: ']';

//Operadores:
NOT		: 'not';
// ---
MULT 	: '*';
DIV 	: '/';
MOD		: '%';
MAS 	: '+';
MENOS 	: '-';
// ---
MENQ	: '<';
MENIG	: '<=';
MAYQ	: '>';
MAYIG	: '>=';
IGL		: '==';
NIGL	: '!=';
// ---
AND		: 'and';
OR		: 'or';
// ---
EQ		: '=';
// ---
COMA	: ',';
PYC		: ';';

// Comillas
CML	: '\'';

/*		
 * ---- REGLAS LEXICAS Y PALABRAS RESERVADAS----
 */	
 
DIST    : ('Binomial' | 'Normal' | 'Poisson' | 'Uniform'); 
NODES   : 'nodes';
DESNODO : 'describe_node';
ATRNS   : 'number_of_servers';
ATRSD   : 'server_distribution';
ARTID   : 'id'; 
CONEX   : 'describe_connection';
ATRIDS  : 'id_start';
ATRIDE  : 'id_end';
SIM     : 'simulation_time';
ANLT    : 'analytics';

/**
 * ---- TOKENS GENERALES ----
 */

ID		: LETRAS+('_'?(LETRAS|INT)+)*;
STR		: CML ('\\' '\'' | . )*? CML;
SIGINT 	: '-'?('0'..'9')+;
INT 	: ('0'..'9')+;
DOBL    : SIGINT '.' INT?;
LETRAS 	: ('a'..'z' | 'A'..'Z');
 
// Comentarios
CMT_MULTI   : '/*' .*? '*/' -> skip;
CMT_SIMPL   : '//' ~[\r\n]* -> skip;

ESPACIO : ( ' '| '\t'| '\r'| '\n')+ -> channel(HIDDEN);

//WS : [ \t\r\n]+ -> skip; //skip spaces, tabs, newlines
