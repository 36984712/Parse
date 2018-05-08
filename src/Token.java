public class Token {
    TokenType type;
    int value;

    public Token(TokenType type, int value){
        this.type = type;
        this.value = value;

    }

    public Token(TokenType type){
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        if(value != 0) {
            return type + " " + value;
        }else{
            return type + "";
        }
    }
}
