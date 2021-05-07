package Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new NoTerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.forEach(e -> e.interpret(context));
    }
}
