grammar g;

// --- Лексерные правила (tokens) ---
INTEGER: 'integer';
REAL: 'real';
BOOLEAN: 'boolean';
BEGIN: 'begin';
END: 'end';
IF: 'if';
ELSE: 'else';
FOR: 'for';
TO: 'to';
STEP: 'step';
NEXT: 'next';
WHILE: 'while';
READLN: 'readln';
WRITELN: 'writeln';
VAR: 'var';

// Операторы и разделители
NEQ: '!=';
EQ: '==';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';
PLUS: '+';
MINUS: '-';
OR: '||';
MUL: '*';
DIV: '/';
AND: '&&';
NOT: '!';
COLON: ':';
COMMA: ',';
SEMICOLON: ';';
ASSIGN: ':=';
LPAREN: '(';
RPAREN: ')';
COMMENT: '%' .*? '%' -> skip ;


// Числа, идентификаторы
fragment DIGIT: [0-9];
ID: [a-zA-Z] [a-zA-Z0-9]*;
INT_CONST: DIGIT+;
REAL_CONST: DIGIT+ '.' DIGIT+ (('E'|'e')('+'|'-')? DIGIT+)?;

// Пробелы и пропуски
WS: [ \t\r\n]+ -> skip;

// --- Парсерные правила ---
//program: (description | statement) (COLON | SEMICOLON)* END ;
//program: (description | statement) ((COLON | SEMICOLON) (description | statement))* END ;
//program: (description | statement)* END ;

program: ( (description | statement) (COLON | NEWLINE) )+ END;




//description: VAR id_list COLON type SEMICOLON ;
description: VAR (id_list COLON type SEMICOLON)+ ;


id_list: ID (COMMA ID)* ;

type: INTEGER | REAL | BOOLEAN ;

statement: assignment
         | compound_statement
         | if_statement
         | for_loop
         | while_loop
         | readln_statement
         | writeln_statement
         ;

assignment: ID ASSIGN expression ;

compound_statement: BEGIN statement (SEMICOLON statement)* END ;

if_statement: IF LPAREN expression RPAREN statement (ELSE statement)? ;

for_loop: FOR assignment TO expression (STEP expression)? statement NEXT ;

while_loop: WHILE LPAREN expression RPAREN statement ;

readln_statement: READLN ID (COMMA ID)* ;

writeln_statement: WRITELN expression (COMMA expression)* ;

expression: operand (relation_op operand)* ;

operand: term (add_op term)* ;

term: factor (mul_op factor)* ;

factor: BINARY_CONST
      | OCTAL_CONST
      | DEC_CONST
      | HEX_CONST
      | INT_CONST
      | REAL_CONST
      | BOOLEAN_CONST
      | ID
      | NOT factor
      | LPAREN expression RPAREN;

relation_op: NEQ | EQ | LT | LE | GT | GE ;

add_op: PLUS | MINUS | OR ;

mul_op: MUL | DIV | AND ;

BOOLEAN_CONST: 'true' | 'false' ;
BINARY_CONST: [01]+ [Bb];
OCTAL_CONST: [0-7]+ [Oo];
DEC_CONST: DIGIT+ [Dd]?;  // без 'D' — обычный вариант
HEX_CONST: [0-9A-Fa-f]+ [Hh];

