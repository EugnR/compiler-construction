grammar g;


// ========== Лексические правила (Lexer Rules — заглавные буквы) ==========

// Ключевые слова
INTEGER : 'integer';
REAL    : 'real';
BOOLEAN : 'boolean';
BEGIN   : 'begin';
END     : 'end';
IF      : 'if';
ELSE    : 'else';
FOR     : 'for';
TO      : 'to';
STEP    : 'step';
NEXT    : 'next';
WHILE   : 'while';
READLN  : 'readln';
WRITELN : 'writeln';
VAR     : 'var';

// Операторы и разделители
NEQ      : '!=';
EQ       : '==';
LT       : '<';
LE       : '<=';
GT       : '>';
GE       : '>=';
PLUS     : '+';
MINUS    : '-';
OR       : '||';
MUL      : '*';
DIV      : '/';
AND      : '&&';
NOT      : '!';
COLON    : ':';
COMMA    : ',';
SEMICOLON: ';';
ASSIGN   : ':=';
LPAREN   : '(';
RPAREN   : ')';

// Комментарии: пропускаем содержимое между %...%
COMMENT  : '%' .*? '%' -> skip;

// Литералы (константы)
BOOLEAN_NUM : 'true' | 'false';
BINARY_NUM  : [01];
OCTAL_NUM   : [0-7];
DECIMAL_NUM : [0-9];
HEX_NUM     : [0-9A-Fa-f];

// Идентификаторы и числа
ID        : LETTER (LETTER | DIGIT)* ;

// Пропуск пробелов и переносов строк
NEWLINE : '\r'? '\n' ;
WS      : [ \t]+ -> skip ;

// ========== fragments (вспомогательные куски, для использования внутри правил) ==========

fragment DIGIT  : [0-9];
fragment LETTER : [a-zA-Z];

// ========== Синтаксические правила (Parser Rules — маленькие буквы) ==========

// Главная точка входа
program : ( (description | operator) (COLON | NEWLINE) )+ END;

// Описание переменных
description : VAR (ID (COMMA ID)* COLON type SEMICOLON)*;

// Типы переменных
type : INTEGER | REAL | BOOLEAN;

// Операторы (операции и управляющие конструкции)
operator : assignment_op | if_op | for_loop | while_loop | readln_op | writeln_op | compound_op ;

// Оператор присваивания
assignment_op : ID ASSIGN expression ;

// Составной оператор begin ... end
compound_op : BEGIN operator (SEMICOLON operator)* END ;

// Условный оператор
if_op : IF LPAREN expression RPAREN operator (ELSE operator)? ;

// Цикл for
for_loop : FOR assignment_op TO expression (STEP expression)? operator NEXT ;

// Цикл while
while_loop : WHILE LPAREN expression RPAREN operator ;

// Оператор ввода
readln_op : READLN ID (COMMA ID)* ;

// Оператор вывода
writeln_op : WRITELN expression (COMMA expression)* ;

// Выражения
expression : operand (relation_op operand)* ;

//операнд
operand : summand (add_op summand)* ;

//слагаемое
summand : multiplier (mul_op multiplier)* ;

//множитель
multiplier : ID | number | BOOLEAN_NUM | NOT multiplier | LPAREN expression RPAREN ;

//число
number : integer | real ;

//целое число
integer : binary | octal | decimal | hexadecimal ;

//двоичное число
binary: (BINARY_NUM)+ ('B' | 'b');

//восьмеричное число
octal: (OCTAL_NUM)+ ('O' | 'o');

//десятичное число
decimal: (DECIMAL_NUM)+ ('D' | 'd')?;

//шестнадцатиричное число
hexadecimal: (HEX_NUM)+ ('H' | 'h');

//действительное число
real : numericString exponent | (numericString)? '.' numericString (exponent)?;

//числовая строка
numericString : (DIGIT)+;

//порядок
exponent: ('E' | 'e') ('+' | '-')? numericString;




// Операторы отношений
relation_op : NEQ | EQ | LT | LE | GT | GE ;

// Операторы сложения
add_op : PLUS | MINUS | OR ;

// Операторы умножения
mul_op : MUL | DIV | AND ;
