package Java8.lamdba;

import java.util.function.Function;
import java.util.stream.Stream;

//Function测试，function的作用是转换，将一个值转为另外一个值
public class FunctionTest {
    public static void main(String[] args) {
        //① 使用map方法，泛型的第一个参数是转换前的类型，第二个是转化后的类型
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();//获取每个字符串的长度，并且返回
            }
        };

        Stream<String> stream = Stream.of("aaa", "bbbbb", "ccccccv");
        Stream<Integer> stream1 = stream.map(function);
        stream1.forEach(System.out::println);
        System.out.println("********************");

        Stream<String> stream2= Stream.of("aaa", "bbbbb", "ccccccv");
        Stream<String> stream3 = stream2.map(e->e.substring(0,1));
        stream3.forEach(System.out::println);
        System.out.println("********************");
    }
}
