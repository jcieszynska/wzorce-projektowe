package Odwiedzający;

public class SpecyficznyOdwiedzajacy extends Odwiedzajacy{
    @Override
    public void OdwiedzSpecyficznyElemnt(SpecyficznyElement e) {
        System.out.println(e.getClass().getName() + " odwiedzony przez " + this.getClass().getName());
    }

    @Override
    public void OdwiedzInnySpecyficznyElemnt(InnySpecyficznyElement e) {
        System.out.println(e.getClass().getName() + " odzwiedzony przez " + this.getClass().getName());
    }
}
