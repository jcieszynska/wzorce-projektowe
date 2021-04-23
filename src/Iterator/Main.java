package Iterator;

public class Main {
    public static void main(String[] args) {
        SpecificContainer<String> specificContainer = new SpecificContainer<String>();

        specificContainer.set(0, "Element A");
        specificContainer.set(1, "Element B");
        specificContainer.set(2, "Element C");
        specificContainer.set(3, "Element D");

        Iterator<String> iterator = specificContainer.createIterator();

        System.out.println(iterator.first());
        while (!iterator.isEnd()) {
            System.out.println(iterator.next());
        }
    }
}
