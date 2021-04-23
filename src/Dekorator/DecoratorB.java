package Dekorator;

public class DecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        System.out.println("DecoratorB.operation()");
    }
}
