package Observer;

/**
 * @author zhouchuang
 * @create 2020-03-23 21:33
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name) {
        super(name);
    }

    @Override
    public void update(NotifyCallback notifyCallback) {
        notifyCallback.callback();
        System.out.println(getName()+"关闭NBA继续上班");
    }
}
