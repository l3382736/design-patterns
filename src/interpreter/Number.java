package interpreter;
import visitor.*;

public class Number implements Expression {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int compute() {
        return this.number;
    }

    public String toString() {
        return Integer.toString(number);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
