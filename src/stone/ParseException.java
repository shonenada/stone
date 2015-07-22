package stone;

import java.io.IOException;

public class ParseException extends Exception {
    public ParseException(Token t) {
        this("", t);
    }

    public ParseException(String m, Token t) {
        super("syntax error around " + location(t) + ". " + m);
    }

    private static String location(Token t) {
        if (t == Token.EOF) {
            return "tht last line";
        } else {
            return "\"" + t.getText() + "\" at line " + t.getLineNumber();
        }
    }
    public ParseException (IOException e) {
        super(e);
    }
    public ParseException(String msg) {
        super(msg);
    }
}
