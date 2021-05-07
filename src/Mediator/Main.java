package Mediator;

public class Main {
    public static void main(String[] args) {
        SpecyficznyMediator m = new SpecyficznyMediator();

        SpecyficznyObiekt1 k1 = new SpecyficznyObiekt1(m);
        SpecyficznyObiekt2 k2 = new SpecyficznyObiekt2(m);

        m.setObiektWspolpracownika1(k1);
        m.setObiektWspolpracownika2(k2);

        k1.Wyslij("Poproszę banana i jabłko");
        k2.Wyslij("Niestety nie ma bananów");
        k1.Wyslij("W takim razie tylko jabłka");
        k2.Wyslij("Proszę bardzo");
        k1.Wyslij("Dziękuję");
    }
}
