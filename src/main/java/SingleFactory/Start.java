package SingleFactory;

/**
 * @author zhouchuang
 * @create 2020-03-22 14:01
 */
public class Start {
    public static void main(String[] args) {
        AddOperation addOperation = OperationFactory.create(AddOperation.class);
        System.out.println(addOperation.result(1,2));

        MinusOperation minusOperation = OperationFactory.create(MinusOperation.class);
        System.out.println(minusOperation.result(2,1));
    }
}
