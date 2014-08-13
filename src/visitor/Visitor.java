package visitor;
import interpreter.*;

public interface Visitor {
    public abstract void visit(Plus plus);
    public abstract void visit(interpreter.Number num);
}
