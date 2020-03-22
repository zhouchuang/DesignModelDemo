package SingleFactory;

/**
 * @author zhouchuang
 * @create 2020-03-22 13:58
 */
public class OperationFactory {
    public static <T extends Operation>  T  create(Class<T> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
