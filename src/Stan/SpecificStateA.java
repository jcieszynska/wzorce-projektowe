package Stan;

public class SpecificStateA implements State {

    @Override
    public void answer(Context context) {
        context.setState(new SpecificStateB());
    }
}
