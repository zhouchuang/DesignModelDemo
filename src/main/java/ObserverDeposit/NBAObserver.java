package ObserverDeposit;

/**
 * @author zhouchuang
 * @create 2020-03-23 21:51
 */
public class NBAObserver  extends Observer{
    private String name;

    public NBAObserver(String name) {
        this.name = name;
    }

    public void closeNBA(){
        System.out.println(name+"关闭NBA继续工作");
    }

    public void openNBA(){
        System.out.println(name+"打开NBA继续嗨");
    }
}
