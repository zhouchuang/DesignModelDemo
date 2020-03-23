package Observer;

/**
 * @author zhouchuang
 * @create 2020-03-23 21:42
 */
public class Start {
    public static void main(String[] args) {
        Boss boss = new Boss();
        NBAObserver nbaObserver = new NBAObserver("张三");
        NewsObserver newsObserver  = new NewsObserver("李四");
        boss.add(nbaObserver);
        boss.add(newsObserver);
        boss.notice();
    }
}
