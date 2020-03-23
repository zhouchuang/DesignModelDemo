package Observer;

/**
 * @author zhouchuang
 * @create 2020-03-23 21:41
 */
public class NewsObserver extends Observer {

    public NewsObserver(String name) {
        super(name);
    }

    @Override
    public void update(NotifyCallback notifyCallback) {
        notifyCallback.callback();
        System.out.println(getName()+"关闭新闻继续上班");
    }
}
