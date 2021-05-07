package Interpreter;

public class TerminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("Called TerminalExpression.Interpret()");
    }
}
