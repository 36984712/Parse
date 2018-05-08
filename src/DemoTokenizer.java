public class DemoTokenizer {
    final static String exp1 = "12   +  3";

    public static void main(String[] args) {
        Tokenizer tk = new MathTokenizer(exp1);
        Token tok;
        while (tk.hasNext()){
            tok = tk.current();
            System.out.println(tok);
            tk.next();
        }
    }
}
