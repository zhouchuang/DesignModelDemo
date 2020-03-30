package Visitor;

public class Man implements Person {
    @Override
    public void accept(Action action) {
        action.manDisplay(this);
    }
}
