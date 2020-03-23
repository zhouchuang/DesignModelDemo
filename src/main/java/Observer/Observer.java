package Observer;

/**
 * @author zhouchuang
 * @create 2020-03-23 21:27
 */
public abstract class Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Observer(String name) {
        this.name = name;
    }

    public abstract void update(NotifyCallback notifyCallback);
}
