package Strategy;

/**
 * @author zhouchuang
 * @create 2020-03-22 14:17
 */
public class Context implements Strategy{
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    @Override
    public double acceptCash(double money) {
        return strategy.acceptCash(money);
    }
}
