package FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouchuang
 * @create 2020-03-29 12:48
 */
public class ChessBoard {
    private static Map<String,Chess> map = new HashMap<>();
    private static int[][] data = new int[10][10];
    private static Chess get(String color){
        if(map.get(color)==null){
            map.put(color,new ConcreteChess(color));
        }
        return map.get(color);
    }

    public static void white(int x,int y){
        step(IChess.White,x,y);
    }
    public static void black(int x,int y){
        step(IChess.Black,x,y);
    }
    private static void step(String color,int x,int y){
        if(data[x][y]==0){
            get(color).step(x,y);
            data[x][y]=1;
            show();
        }else{
            System.out.println("这里有子了，不能下这里");
        }

    }
    private static void show(){
        for(int i=0;i<data.length;i++){
            int[] temp = data[i];
            for(int j=0;j<temp.length;j++){
                System.out.print(temp[j]==0?" o ":" * ");
            }
            System.out.println();
        }
    }
}
