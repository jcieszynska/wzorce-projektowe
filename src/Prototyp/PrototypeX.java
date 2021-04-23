package Prototyp;

public class PrototypeX extends Prototype {


    public PrototypeX(int id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new PrototypeX(this.getId());
    }
}
