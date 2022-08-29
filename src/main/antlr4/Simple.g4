grammar Simple;

@header {
    package cz.zcu.kiv.gen;
    import cz.zcu.kiv.gen.SimpleParser;
    import cz.zcu.kiv.gen.SimpleListener;
}

program
    : functionDeclaration* mainFunctionDeclaration
    ;

declaration
    : typeQualifier? nonVoidTypeSpecifier Identifier (EqualSign conditionalExpression)?
    | arrayTypeSpecifier Identifier
    ;

assignment
    : Identifier EqualSign conditionalExpression
    | arrayAccess EqualSign conditionalExpression
    ;

arrayAccess
    : Identifier LeftBracket conditionalExpression RightBracket
    ;

statement
    :   expressionStatement
    |   selectionStatement
    |   iterationStatement
    ;

iterationStatement
    :   whileCondition scope
    |   Do scope whileCondition Semi
    |   forLoop
    ;

forLoop
    : For Identifier In (Identifier | NonzeroConstant) scope
    ;

expressionStatement
    :   expression? Semi
    ;

labeledStatement
    :   Case signedConstant Colon scope
    |   Default Colon scope
    ;

returnStatement
    : 'return' expression? Semi
    ;

selectionStatement
    : If condition scope (Else scope)?
    | Switch nonVoidReturnValue LeftBrace labeledStatement+ RightBrace
    ;

blockItemList
    :   blockItem+
    ;

blockItem
    :   statement
    |   declaration
    |   returnStatement
    ;

expression
    :   conditionalExpression
    |   assignment
    |   signedConstant
    |   BooleanLiteral
    ;

nonVoidReturnValue
    : functionCall
    | BooleanLiteral
    | signedConstant
    | Identifier
    | arrayAccess
    ;

scope
    : LeftBrace blockItemList? RightBrace
    ;

functionScope
    : LeftBrace blockItemList? returnStatement RightBrace
    ;

condition
    : LeftParen expression RightParen
    ;

whileCondition
    : While condition
    ;

conditionalExpression
    :   nonVoidReturnValue (Question expression Colon expression)?
    ;

functionDeclaration
    : Func functionReturnType Identifier LeftParen functionDeclParams? RightParen functionScope
    ;

functionReturnType
    : baseTypeSpecifier
    | arrayTypeSpecifier
    ;

mainFunctionDeclaration
    : Func Void 'main' LeftParen RightParen functionScope
    ;

functionDeclParams
    : functionDeclParam (Comma functionDeclParam)*
    ;

functionDeclParam
    : (nonVoidTypeSpecifier | arrayTypeSpecifier) Identifier
    ;

functionCall
    : LeftParen functionIdentifier functionCallParams? RightParen
    | LeftParen Instanceof functionCallParam Comma (baseTypeSpecifier | arrayFunctionParamTypeSpecifier) RightParen
    | LeftParen unaryOperator functionCallParam RightParen
    ;

functionCallParams
    : functionCallParam (Comma functionCallParam)*
    ;

functionCallParam
    : Identifier
    | functionCall
    | BooleanLiteral
    | decimalConstant
    | arrayAccess
    ;

functionIdentifier
    : Identifier
    | comparisonOperator
    | arithmeticOperator
    | logicalOperator
    ;

arrayFunctionParamTypeSpecifier
    : nonVoidTypeSpecifier LeftBracket RightBracket
    ;

arrayTypeSpecifier
    : nonVoidTypeSpecifier LeftBracket NonzeroConstant RightBracket
    ;

baseTypeSpecifier
    : nonVoidTypeSpecifier
    | Void
    ;

nonVoidTypeSpecifier
    : Int
    | Bool
    ;

typeQualifier
    : Const
    ;

unaryOperator
    : Negate
    | Minus
    ;

comparisonOperator
    : Less
    | LessEqual
    | Greater
    | GreaterEqual
    | Equal
    ;

arithmeticOperator
    : Plus
    | Minus
    | Div
    | Star
    | Mod
    ;

logicalOperator
    : And
    | Or
    ;

signedConstant
    :   (Plus | Minus)? decimalConstant
    ;


decimalConstant
    :   NonzeroConstant
    | '0'
    ;

Const : 'const';
If : 'if';
Switch : 'switch';
Case : 'case';
Default : 'default';
Func : 'func';
Int : 'int';
Bool : 'bool';
Void : 'void';
For : 'for';
In : 'in';
While : 'while';
Else : 'else';
Do : 'do';
Instanceof : 'instanceof';
Return : 'return';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
Equal : '==';

EqualSign : '=';

Plus : '+';
Minus : '-';
Star : '*';
Div : '/';
Mod : '%';

And : 'AND';
Or : 'OR';
Negate: '!';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';


BooleanLiteral
    : 'true'
    | 'false'
    ;


Identifier
    :   Nondigit (Nondigit)*
    ;

fragment
Nondigit
    : [a-zA-Z]
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;


NonzeroConstant
    : NonzeroDigit Digit*
    ;

DigitSequence
    :   Digit+
    ;

NonzeroDigitSequence
    : NonzeroDigit+
    ;

fragment
Sign
    :   [+-]
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;