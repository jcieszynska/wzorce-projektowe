package com.company;

class Klient {
    public String _imie;

    public Klient(String Imie) {
        this._imie = Imie;
    }


    public String getImie() {
        return _imie;
    }
}
class Bank {
    public boolean PosiadaWystarczajaceOszczednosci(Klient klient, int wartoscZayptaniaKredytowego) {
        System.out.println("Sprawdzanie banku dla " + klient.getImie());
        return true;
    }
}
class Kredyt {
    public boolean PosiadaDobraHistorieKredytowa(Klient klient) {
        System.out.println("Sprawdzanie historii kredytowej dla " + klient.getImie());
        return true;
    }
}

class Pozyczka  {
    public boolean NiePosiadaNieOplaconychPozyczek(Klient klient) {
        System.out.println("Sprawdzanie historii pożyczek dla " + klient.getImie());
        return true;
    }
}
class Hipoteka  {
    private Bank _bank = new Bank();
    private Pozyczka _pozycznka = new Pozyczka();
    private Kredyt _kredyt = new Kredyt();

    public boolean CzyKwalifikujeSie(Klient klient, int wartoscZayptaniaKredytowego ) {
        System.out.println(klient.getImie() + " wysłał zapyanie o kredyt hipoteczny o wartości " + wartoscZayptaniaKredytowego + "\n");
        boolean kwalifikujeSie = true;

        if(!_bank.PosiadaWystarczajaceOszczednosci(klient, wartoscZayptaniaKredytowego)) {
            kwalifikujeSie = false;
        } else if (!_pozycznka.NiePosiadaNieOplaconychPozyczek(klient)) {
            kwalifikujeSie = false;
        } else if (!_kredyt.PosiadaDobraHistorieKredytowa(klient)){
            kwalifikujeSie = false;
        }

        return kwalifikujeSie;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Hipoteka hipoteka = new Hipoteka();
        Klient klient = new Klient("Jan Kowalski");
        boolean kwalifikujeSie = hipoteka.CzyKwalifikujeSie(klient, 123456);

        System.out.println("\n" + klient.getImie() + " zakwalifkował się w systemie jako " +(kwalifikujeSie ? "zakwalifikowany" : "niezakwalifikowany"));
    }
}
