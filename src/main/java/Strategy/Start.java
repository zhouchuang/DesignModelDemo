package Strategy;

/**
 * @author zhouchuang
 * @create 2020-03-22 14:34
 */
public class Start {
    public static void main(String[] args) {
        print(100,0);
        print(200,1);
        print(310,2);
    }
    private static void print(double money,int index){
        System.out.println("原价:"+money +"，现价:"+ CashStrategyFactory.create(index).acceptCash(money));
    }
}
