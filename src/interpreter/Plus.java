package interpreter;
import visitor.*;

public class Plus extends Operator {

    public Plus(Expression left, Expression right, 
            String operator) {
        super(left, right, operator);
    }

    public int compute() {
        return left.compute() + right.compute();
    }

    public void accept(Visitor visitor) {
        left.accept(visitor);
        visitor.visit(this);
        right.accept(visitor);
    }
}
