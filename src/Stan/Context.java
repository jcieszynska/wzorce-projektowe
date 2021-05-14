package Stan;

public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("Stan: " + this.state.getClass().getName());
    }

    public Context(State state) {
        this.state = state;
    }

    public void ask() {
        this.state.answer(this);
    }
}
