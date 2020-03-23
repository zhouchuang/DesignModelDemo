package ObserverDeposit;

/**
 * @author zhouchuang
 * @create 2020-03-23 22:45
 */
public class Boss extends Trigger{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boss(String name) {
        this.name = name;
    }
}
