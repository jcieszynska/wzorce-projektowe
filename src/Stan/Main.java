package Stan;

public class Main {
    public static void main(String[] args) {
        Context c = new Context(new SpecificStateA());

        c.ask();
        c.ask();
        c.ask();
        c.ask();
    }
}
