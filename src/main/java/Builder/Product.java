package Builder;

import java.util.ArrayList;
import java.util.List;

public class Product implements IProduct{
    List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("---产品展示----");
        parts.stream().forEach(p-> System.out.println(p));
    }
}
