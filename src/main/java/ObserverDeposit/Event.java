package ObserverDeposit;

/**
 * @author zhouchuang
 * @create 2020-03-23 23:07
 */
public enum  Event {
    Back(1),Out(2),Salary(3);
    private int value;

    public int getValue() {
        return value;
    }

    Event(int value) {
        this.value = value;
    }
}
