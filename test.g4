// test file

grammar test;
r : 'hello' ID;

ID: [A-Za-z0-9]+;

WS: [ \t\n\r]+ -> skip;
