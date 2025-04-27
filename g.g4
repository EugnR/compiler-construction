grammar g;

//* — ноль или больше раз. То есть может быть вообще ничего.
//+ — один или больше раз. То есть минимум один раз обязательно.


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

// Пробелы и пропуски | все пробельные символы игнорируются и не попадают в список токенов.
//WS: [ \t\r\n]+ -> skip;

// пропускаются пробелы и табуляции, отлавливаются в токен переносы строки (\r опционально для windows)
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;



// --- Парсерные правила ---
//program: (description | statement) (COLON | SEMICOLON)* END ;
//program: (description | statement) ((COLON | SEMICOLON) (description | statement))* END ;
//program: (description | statement)* END ;

program: ( (description | operator) (COLON | NEWLINE) )+ END;




//description: VAR id_list COLON type SEMICOLON ;
description: VAR (  ID (COMMA ID)*   COLON type SEMICOLON)* ;


//id_list: ID (COMMA ID)* ;

type: INTEGER | REAL | BOOLEAN ;

operator: assignment_op
         | compound_op
         | if_op
         | for_loop
         | while_loop
         | readln_op
         | writeln_op
         ;

//присвоение
assignment_op: ID ASSIGN expression ;

//составной оператор
compound_op: BEGIN operator (SEMICOLON operator)* END ;

if_op: IF LPAREN expression RPAREN operator (ELSE operator)? ;

for_loop: FOR assignment_op TO expression (STEP expression)? operator NEXT ;

while_loop: WHILE LPAREN expression RPAREN operator ;

readln_op: READLN ID (COMMA ID)* ;

writeln_op: WRITELN expression (COMMA expression)* ;

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

