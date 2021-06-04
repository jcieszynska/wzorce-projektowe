package Strategia;

public class Main {
    public static void main(String[] args) {
        Kontekst kontekst;
        kontekst = new Kontekst(new SpecyficznaStrategiaA());
        kontekst.ZwrocProblem();

        kontekst = new Kontekst(new SpecyficznaStrategiaB());
        kontekst.ZwrocProblem();
    }
}
