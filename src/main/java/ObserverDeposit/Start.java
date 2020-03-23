package ObserverDeposit;

/**
 * @author zhouchuang
 * @create 2020-03-23 22:47
 */
public class Start {
    public static void main(String[] args) {
        Boss boss = new Boss("胡汉三");
        NBAObserver jd = new NBAObserver("乔丹");
        NBAObserver ym = new NBAObserver("姚明");

        NewsObserver dl = new NewsObserver("丁磊");

        jd.addEventList(Deposit.Event.Back,()->{
            System.out.println(boss.getName()+"来了");
            jd.closeNBA();
        });

        ym.addEventList(Deposit.Event.Back,()->{
            System.out.println(boss.getName()+"来了");
            ym.closeNBA();
        });

        dl.addEventList(Deposit.Event.Back,()->{
            System.out.println(boss.getName()+"来了");
            dl.closeNews();
        });

        jd.addEventList(Deposit.Event.Out,()->{
            System.out.println(boss.getName()+"走了");
            jd.openNBA();
        });

        ym.addEventList(Deposit.Event.Out,()->{
            System.out.println(boss.getName()+"走了");
            ym.openNBA();
        });

        dl.addEventList(Deposit.Event.Out,()->{
            System.out.println(boss.getName()+"走了");
            dl.openNews();
        });

        boss.trigger(Deposit.Event.Back);

        boss.trigger(Deposit.Event.Out);
    }
}
