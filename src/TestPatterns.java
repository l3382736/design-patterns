import java.util.Stack;
import visitor.*;
import interpreter.*;

public class TestPatterns {

    public static void main (String args[]) {
        String expression = "1 + 1 + 1";
        Expression root = parse(expression);
        PrintVisitor v = new PrintVisitor();
        root.accept(v);
        System.out.println(" = " + root.compute());
    }

    public static Expression parse (String exp) {
        Stack<Expression> numbers = new Stack<Expression>(); 
        Stack<Character> operators = new Stack<Character>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
            if (c == ' ') continue;
            if (c == '+') {
                operators.push(c);
            } else {
                numbers.push (
                        new interpreter.Number(Character.getNumericValue(c))
                        );
            }
        }

        Expression root = null;
        Expression left = null, right = null;
        while (!operators.isEmpty()) {
            right = numbers.pop();
            if (root ==  null) {
                left = numbers.pop();
                root = new Plus (left, right, "" + operators.pop());
            } else {
                Expression newroot = 
                    new Plus (root, right, "" + operators.pop());
                root = newroot;
            }
        }

        return root;
    }
}
