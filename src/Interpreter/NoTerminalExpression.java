package Interpreter;

public class NoTerminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("Called NoTerminalExpression.Interpret()");
    }
}
