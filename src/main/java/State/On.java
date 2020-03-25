package State;

public class On implements State {
    @Override
    public void switchHandler(Context context) {
        context.setState(new Off());
    }
}
