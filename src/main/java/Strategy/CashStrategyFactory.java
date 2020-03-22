package Strategy;

/**
 * @author zhouchuang
 * @create 2020-03-22 14:19
 */
public class CashStrategyFactory {
    public static <T extends Strategy> Context create(int index){
        switch (index){
            case 1:return new Context(new RebateStategy(0.8f));
            case 2:return new Context(new ReturnStategy(300,100));
            default: return new Context(new NormalStrategy());
        }
    }
}
