package Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TowListRemoveSame {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");list1.add("b");list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("d");list2.add("b");list2.add("c");
        List<String> newlist1=list1.stream().filter(t-> !list2.contains(t)).collect(Collectors.toList());
        newlist1.stream().forEach(System.out::println);
        List<String> newlist2=list2.stream().filter(t-> !list1.contains(t)).collect(Collectors.toList());
        newlist2.stream().forEach(System.out::println);


        Map<String,String> map1 = new HashMap<>();
        map1.put("a","A");map1.put("b","B");map1.put("c","C");
        Map<String,String> map2 = new HashMap<>();
        map2.put("d","D");map2.put("b","B");map2.put("c","C");
        System.out.println(map2.keySet().contains("a"));
        map1.entrySet().stream().forEach(m-> System.out.println(m.getKey()));
        List<String> list3  = map1.entrySet().stream().filter(m -> !map2.keySet().contains(m.getKey())).map(m->m.getValue()).collect(Collectors.toList());
        System.out.println(list3);
    }
}
