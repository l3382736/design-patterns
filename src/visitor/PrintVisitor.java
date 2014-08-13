package visitor;
import interpreter.*;

public class PrintVisitor implements Visitor {

    public void visit(Plus plus) {
        System.out.print(plus.toString() + " ");
    }

    public void visit(interpreter.Number num) {
        System.out.print(num.toString() + " ");
    }
}
