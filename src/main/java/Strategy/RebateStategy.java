package Strategy;

/**
 * @author zhouchuang
 * @create 2020-03-22 14:11
 */
public class RebateStategy implements Strategy {
    private float rebate;
    public RebateStategy(float rebate){
        this.rebate = rebate;
    }
    @Override
    public double acceptCash(double money) {
        return rebate*money;
    }
}
