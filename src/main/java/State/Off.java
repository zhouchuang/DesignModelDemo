package State;

public class Off implements State {
    @Override
    public void switchHandler(Context context) {
        context.setState(new On());
    }
}
