package State;

public class Context{
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public Context setState(State state) {
        this.state = state;
        return this;
    }

    public void switchHandler() {
        state.switchHandler(this);
        System.out.println(state.getClass().getSimpleName());
    }
}
