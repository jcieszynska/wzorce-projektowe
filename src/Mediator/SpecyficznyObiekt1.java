package Mediator;

public class SpecyficznyObiekt1 extends ObiektWspolpracownika {

    public SpecyficznyObiekt1(Mediator mediator) {
        super(mediator);
    }

    public void Wyslij(String wiadomosc){
        mediator.Wyslij(wiadomosc, this);
    }

    public void Powiadom(String wiadomosc){
        System.out.println("Specyficzny obiekt dostaje wiadomosc: " + wiadomosc);
    }
}