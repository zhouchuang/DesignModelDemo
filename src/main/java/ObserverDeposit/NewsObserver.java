package ObserverDeposit;

/**
 * @author zhouchuang
 * @create 2020-03-23 21:52
 */
public class NewsObserver  extends Observer{
    private String name;

    public NewsObserver(String name) {
        this.name = name;
    }

    public void closeNews(){
        System.out.println(name+"关闭新闻继续工作");
    }

    public void openNews(){
        System.out.println(name+"打开新闻继续嗨");

    }

}
