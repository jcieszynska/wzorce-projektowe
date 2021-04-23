package Kompozyt;
import java.util.*;

abstract class Element {
    protected String nazwa;

    public Element(String nazwa){
        this.nazwa = nazwa;
    }

    public abstract void Dodaj(Element c);
    public abstract void Usun(Element c);
    public abstract void Pokaz(int poziom);
}

class Kompozyt extends Element {

    private List<Element> _dzieci = new ArrayList<>();

    public Kompozyt(String nazwa) {
        super(nazwa);
    }

    @Override
    public void Dodaj(Element c) {
        _dzieci.add(c);
    }

    @Override
    public void Usun(Element c) {
        _dzieci.remove(c);
    }

    @Override
    public void Pokaz(int poziom) {
        System.out.println(poziom + nazwa);

        for (Element element : _dzieci) {
            element.Pokaz(poziom + 2);
        }
    }
}
class Lisc extends Element {

    public Lisc(String nazwa) {
        super(nazwa);
    }

    @Override
    public void Dodaj(Element c) {
        System.out.println("Nie można dodać do liścia");
    }

    @Override
    public void Usun(Element c) {
        System.out.println("Nie można usunąć z liścia");
    }

    @Override
    public void Pokaz(int poziom) {
        System.out.println(poziom + nazwa);
    }
}

public class Main {
    public static void main(String[] args) {
	// write your code here
        Kompozyt root = new Kompozyt("root");
        root.Dodaj(new Lisc("Lisc A"));
        root.Dodaj(new Lisc("Lisc B"));

        Kompozyt comp = new Kompozyt("Kompozyt X");
        comp.Dodaj(new Lisc("Lisc XA"));
        comp.Dodaj(new Lisc("Lisc XB"));

        root.Dodaj(comp);
        root.Dodaj(new Lisc("Lisc C"));

        Lisc leaf = new Lisc("Lisc D");
        root.Dodaj(leaf);
        root.Usun(leaf);

        root.Pokaz(1);
    }
}
