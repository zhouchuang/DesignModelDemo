package Strategy;

/**
 * @author zhouchuang
 * @create 2020-03-22 14:09
 */
public class NormalStrategy implements Strategy{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
