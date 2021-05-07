package Polecenie;

public class Main {
    public static void main(String[] args) {
        Odbiorca odbiorca = new Odbiorca();
        Polecenie polecenie= new SpecyficznePolecenie(odbiorca);
        ObiektWywolujace wywolujace = new ObiektWywolujace();

        wywolujace.UstawPolecenie(polecenie);
        wywolujace.WykonajPolecenie();
    }
}
