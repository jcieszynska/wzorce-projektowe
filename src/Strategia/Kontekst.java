package Strategia;

class Kontekst {
    private Strategia _strategia;
    public Kontekst(Strategia strategia) {
        _strategia = strategia;
    }

    public void ZwrocProblem(){
        _strategia.RozwiazanieProblemu();
    }
}
