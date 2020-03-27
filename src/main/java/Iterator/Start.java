package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        ListIterator iterator = new ListIterator(list);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //我传一个随便的对象到Iterator，都可以遍历
        Box box = new Box(list);
        BoxIterator listIterator01 = new BoxIterator(box);
        while(listIterator01.hasNext()){
            System.out.println(listIterator01.next());
        }

        List<String> provinces = new ArrayList<>();
        provinces.add("湖南省");
        provinces.add("湖北省");
        Province province = new Province(provinces);
        ProvinceIterator provinceIterator = new ProvinceIterator(province);
        while(provinceIterator.hasNext()){
            System.out.println(provinceIterator.next());
        }
    }
}
