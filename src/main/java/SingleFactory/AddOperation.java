package SingleFactory;

/**
 * @author zhouchuang
 * @create 2020-03-22 13:57
 */
public class AddOperation implements Operation {
    @Override
    public double result(double a, double b) {
        return a+b;
    }
}
