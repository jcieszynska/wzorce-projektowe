package Mediator;

public class SpecyficznyMediator extends Mediator {
    public SpecyficznyObiekt1 _wspolpracownik1;
    public SpecyficznyObiekt2 _wspolpracownik2;

    public SpecyficznyObiekt1 ObiektWspolpracownika1;
    public void setObiektWspolpracownika1(SpecyficznyObiekt1 obiektWspolpracownika1) {
        _wspolpracownik1 = obiektWspolpracownika1;
    }

    public SpecyficznyObiekt2 ObiektWspolpracownika2;
    public void setObiektWspolpracownika2(SpecyficznyObiekt2 obiektWspolpracownika2) {
        _wspolpracownik2 = obiektWspolpracownika2;
    }

    @Override
    public void Wyslij(String wiadomosc, ObiektWspolpracownika wspolpracownik) {
        if (wspolpracownik == _wspolpracownik1){
            _wspolpracownik2.Powiadom(wiadomosc);
        } else {
            _wspolpracownik1.Powiadom(wiadomosc);
        }
    }

}
