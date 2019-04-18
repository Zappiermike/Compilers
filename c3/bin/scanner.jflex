import java_cup.runtime.Symbol;

%%

%{
  Symbol makeToken(int id, Object val){
    // yychar and yychar+yylength() are the positions of left and right ends
    return new Symbol(id, yychar, yychar + yylength(), val);
  }

  Symbol makeToken(int id){  // as above but with no attribute value
    return new Symbol(id, yychar, yychar + yylength());
  }
%}

%char
%cup
%cupdebug
%unicode

%%

//Added int to denote that it is a keyword for the scanner to recognize and not just a regular LETTER
"int"                   {return makeToken(sym.INT);}

//Added this regex string to find any name that starts with a letter and can be followed by more letters/numbers.
[a-zA-Z][a-zA-Z0-9]*    {return makeToken(sym.LETTER, yytext());}

//Added semicolon according to the third phase in the project
";"                     {return makeToken(sym.SEMI);}
","                     {return makeToken(sym.COMMA);}


//Added the left and right curly brackets to work with the fourth phase in the project
"{"                     {return makeToken(sym.LCURLY);}
"}"                     {return makeToken(sym.RCURLY);}

//Adding equals to work for the assignment operations
"="                     {return makeToken(sym.EQUALS);}

//These were already implemented
"/"                     {return makeToken(sym.DIVIDE);}
[0-9]+                  {return makeToken(sym.NUMBER, yytext());}
"-"                     {return makeToken(sym.MINUS);}
"*"                     {return makeToken(sym.TIMES);}
"("                     {return makeToken(sym.LPAREN);}
")"                     {return makeToken(sym.RPAREN);}
"%"                     {return makeToken(sym.MOD);}
"+"                     {return makeToken(sym.PLUS);}
"<"                     {return makeToken(sym.LESS);}
">"                     {return makeToken(sym.MORE);}
"<="                    {return makeToken(sym.LESSEQ);}
">="                    {return makeToken(sym.MOREEQ);}
"=="                    {return makeToken(sym.EQEQ);}
"!="                    {return makeToken(sym.NOTEQ);}
" "|\r|\n|\t|\f         {}

//Added this comment portion according to the first phase in the project
"//".*	                {}

.                       {return makeToken(sym.ILLEGAL_CHAR, yytext());}
