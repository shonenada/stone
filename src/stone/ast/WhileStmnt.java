package stone.ast;
import java.util.List;

public class WhileStmnt extends ASTList {
    public WhileStmnt (List<ASTList> c) {
        super(c);
    }
    public ASTree condition () {
        return child(0);
    }
    public ASTree body () {
        return child(1);
    }
    public String toString() {
        return "(while " + condition() + " " + body() + ")";
    }
} 
