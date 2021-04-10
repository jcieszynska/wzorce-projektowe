package com.company;

class Odtwarzacz {
    private String _nazwa;

    public void UstawNazwe(String nazwa) {
        _nazwa = nazwa;
    }

    public void Pokaz() {
        System.out.println("\n" + _nazwa);
    }
}

abstract  class BudowniczyOdtwarzaczy {
    public abstract void ZbudujOdtwarzacz();
    public abstract Odtwarzacz ZwrocOdtwarzacz();

}

class KreatorOdtwarzaczaFlash extends BudowniczyOdtwarzaczy {

    private Odtwarzacz _odtwarzacz;

    public KreatorOdtwarzaczaFlash(){
        _odtwarzacz = new Odtwarzacz();
    }

    @Override
    public void ZbudujOdtwarzacz() {
        _odtwarzacz.UstawNazwe("Odtwarzacz Flash");
    }

    @Override
    public Odtwarzacz ZwrocOdtwarzacz() {
        return _odtwarzacz;
    }
}

class KreatorOdtwarzaczaHTML extends BudowniczyOdtwarzaczy {

    private Odtwarzacz _odtwarzacz;

    public KreatorOdtwarzaczaHTML(){
        _odtwarzacz = new Odtwarzacz();
    }

    @Override
    public void ZbudujOdtwarzacz() {
        _odtwarzacz.UstawNazwe("Odtwarzacz HTML");
    }

    @Override
    public Odtwarzacz ZwrocOdtwarzacz() {
        return _odtwarzacz;
    }
}

class Generator {
    public BudowniczyOdtwarzaczy Skladaj(BudowniczyOdtwarzaczy budowniczy) {
        budowniczy.ZbudujOdtwarzacz();

        return budowniczy;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        KreatorOdtwarzaczaFlash kreatorOdtwarzaczaFlash = new KreatorOdtwarzaczaFlash();
        KreatorOdtwarzaczaHTML kreatorOdtwarzaczaHTML = new KreatorOdtwarzaczaHTML();
        Generator generator = new Generator();

        generator
                .Skladaj(kreatorOdtwarzaczaFlash)
                .ZwrocOdtwarzacz()
                .Pokaz();

        generator
                .Skladaj(kreatorOdtwarzaczaHTML)
                .ZwrocOdtwarzacz()
                .Pokaz();
    }
}
