package Odwiedzający;

public class Main {
    public static void main(String[] args) {
        Struktura o = new Struktura();

        o.Dolacz(new SpecyficznyElement());
        o.Dolacz(new InnySpecyficznyElement());

        SpecyficznyOdwiedzajacy v1 = new SpecyficznyOdwiedzajacy();
        InnySpecyficznyOdwiedzajacy v2 = new InnySpecyficznyOdwiedzajacy();

        o.Akceptuj(v1);
        o.Akceptuj(v2);

    }
}
