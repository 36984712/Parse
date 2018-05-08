public abstract class Tokenizer {
    abstract boolean hasNext();  // checks if there is more tokens to come
    abstract Token current();  // returns the current token the tokenizer is pointing at
    abstract void next();  // move onto the next token
}
