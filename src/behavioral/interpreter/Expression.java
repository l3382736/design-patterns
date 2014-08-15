package interpreter;
import visitor.*;

public interface Expression {
    public int compute();
    public String toString();
    public void accept(Visitor visitor);
}
