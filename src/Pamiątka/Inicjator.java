package Pamiątka;

public class Inicjator {
    private String _stan;

    public String get_stan() {
        return _stan;
    }

    public void set_stan(String _stan) {
        this._stan = _stan;
        System.out.println("Stan = " + _stan);
    }

    public Pamiatka UtworzPamiatke() {
        return (new Pamiatka(_stan));
    }

    public void UstawPAmiatke(Pamiatka pamiatka) {
        System.out.println("Przywracanie stanu...");
        _stan = get_stan();
    }
}
