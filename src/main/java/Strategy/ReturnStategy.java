package Strategy;

/**
 * @author zhouchuang
 * @create 2020-03-22 14:12
 */
public class ReturnStategy implements Strategy {
    private double conditionMoney;
    private double returnMoney;

    public ReturnStategy(double conditionMoney, double returnMoney) {
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    public double acceptCash(double money) {
        return money>=conditionMoney?(money-returnMoney):money;
    }
}
