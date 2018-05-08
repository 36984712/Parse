public class MathTokenizer extends Tokenizer {
    private String text;
    private int pos;
    private Token current;

    static final char whitespace[] = {' ', '\n', '\t'};

    public MathTokenizer(String text) {
        this.text = text;
        this.pos = 0;
        next();
    }

    boolean hasNext() {
        return current != null;
    }

    Token current() {
        return current;
    }

    private void consumewhite() {
        while (pos < text.length() && isin(text.charAt(pos), whitespace))
            pos++;
    }

    private boolean isin(char c, char charlist[]) {
        for (char w : charlist) {
            if (w == c)
                return true;
        }
        return false;
    }

    public void next() {
        consumewhite();
        if (pos == text.length()) {
            current = null;

        } else if (text.charAt(pos) == '+') {
            current = new Token(TokenType.PLUS);
            pos++;
        }else if (text.charAt(pos) == '-') {
            current = new Token(TokenType.MINUS);
            pos++;
        }else if (text.charAt(pos) == '*') {
            current = new Token(TokenType.MULT);
            pos++;
        }else if (text.charAt(pos) == '/') {
            current = new Token(TokenType.DIV);
            pos++;
        }else if (text.charAt(pos) == '(') {
            current = new Token(TokenType.LBRA);
            pos++;
        }else if (text.charAt(pos) == ')') {
            current = new Token(TokenType.RBRA);
            pos++;
        }else if (Character.isDigit(text.charAt(pos))){
            int start = pos;
            while (pos < text.length() && Character.isDigit(text.charAt(pos)) )
                pos++;
            current = new Token(TokenType.INTLIT, Integer.parseInt(text.substring(start, pos)));
        }
    }

}

