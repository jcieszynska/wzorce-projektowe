package Stan;

public class SpecificStateB implements State {

    @Override
    public void answer(Context context) {
        context.setState(new SpecificStateA());
    }
}
