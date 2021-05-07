package Polecenie;

class SpecyficznePolecenie extends Polecenie {
    public SpecyficznePolecenie(Odbiorca odbiorca) {
        super(odbiorca);
    }

    @Override
    public void Wykonaj() {
        odbiorca.Uruchom();
    }
}
