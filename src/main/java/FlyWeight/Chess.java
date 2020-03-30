package FlyWeight;

/**
 * @author zhouchuang
 * @create 2020-03-29 12:43
 */
public abstract class Chess implements IChess{
    protected String color;

    public Chess(String color) {
        this.color = color;
    }

    public  void step(int x , int y){
        System.out.println(color+"横"+x+"竖"+y);
    }
}
