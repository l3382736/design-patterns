package interpreter;
import visitor.*;

public abstract class Operator implements Expression {

    protected Expression left, right;
    protected String operator;

    public Operator(Expression left, Expression right, 
            String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public String toString() {
        return this.operator;
    }
}
