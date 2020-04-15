package Java8;

import java.util.Date;

public class Constration {

    public Constration(){
        System.out.println("no args Constructors");
    }

    public Constration(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {

        String now  = DateUtils.format(new Date(),"yyyy-MM-dd hh:mm:ss");
        String nine = now.substring(0,10)+" 21:00:00";
        long t =  DateUtils.getTimeMillisFromDateToNow(DateUtils.tansf(nine,"yyyy-MM-dd hh:mm:ss"));
        System.out.println(t/1000/3600);
    }
}
