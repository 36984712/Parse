// <exp> ::= <integer lit> | ( <exp> + <exp> ) | ( <exp> - <exp> ) | ( <exp> / <exp> ) | ( <exp> * <exp> ) | - <exp>

import java.text.ParseException;

public abstract class Parser {
    public static Parser parse(Tokenizer tok) throws ParseException{
        Token t = tok.current();
        if (t.type == TokenType.INTLIT) {
            int v = t.value;
            tok.next();
            //return new Num(v);
        }else if(t.type == TokenType.LBRA){
            tok.next();
        }
    }
}

// Not finished, should base on lab 3 Exp class. Look at lecture-example-code Expression class.
