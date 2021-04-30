package ŁańcuchZobowiązań;

class SpecyficznaObsluga1 extends AbstrakcyjnaObsluga{
    @Override
    public void Obsluz(int zobowiazanie) {
        if (zobowiazanie >= 0 && zobowiazanie <10)
        {
            System.out.println(this.getClass().getName() + " Obsluzono zobowiazanie " + zobowiazanie);
        }
        else if (nastepca != null) {
            nastepca.Obsluz(zobowiazanie);
        }
    }
}
