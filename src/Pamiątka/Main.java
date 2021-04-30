package Pamiątka;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Inicjator i = new Inicjator();
        i.set_stan("Włącz");

        Zarzadzajacy z = new Zarzadzajacy();
        z.set_pamiatka(i.UtworzPamiatke());

        i.set_stan("Wyłącz");

        i.UstawPAmiatke(z.get_pamiatka());

    }
}
