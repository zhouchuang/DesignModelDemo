package Visitor;

public class Wuman implements Person {
    @Override
    public void accept(Action action) {
        action.wumanDisplay(this);
    }
}
