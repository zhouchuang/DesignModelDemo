package Java8.lamdba;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class First {
    public static void main(String[] args) {
        MyLambdaInterface inter  = (s)->System.out.println(s);
        inter.dosome("hello");

        enact(inter,"hello");

        enact((s)->System.out.println(s),"hello");


        Person person = new Person();
        person.setAge(1);person.setFirstName("周");person.setLastName("创");
        Person person1 = new Person();
        person1.setAge(1);person1.setFirstName("张");person1.setLastName("三");
        Person person2 = new Person();
        person2.setAge(2);person2.setFirstName("李");person2.setLastName("四");
        List<Person> list = Lists.newArrayList();
        list.add(person);list.add(person1);list.add(person2);
        checkAndExecute(list,
                (p)->p.getAge()==1,
                (p)->System.out.println(p.toString()));

        checkAndExecute2(list,
                (p)->p.getAge()>1,
                System.out::println);

        list.stream().filter(p->p.getAge()>1).forEach(System.out::println);

        Optional<Person> person3 = Optional.ofNullable(person);
        person3.ifPresent(System.out::println);
        person3.orElse(null);
        person3.orElseGet(()->new Person());
        person3.map(p->p.getFirstName())
                .map(p->p.toUpperCase())
                .orElse(null);


    }

    public static void enact(MyLambdaInterface inter,String s){
        inter.dosome(s);
    }

    public static void checkAndExecute(List<Person> personList,
                                       NameCheck nameCheck,
                                       Executor executor){
        personList.forEach(p -> {
            if(nameCheck.check(p)){
                executor.execute(p);
            }
        });
    }

    public static void checkAndExecute2(List<Person> personList,
                                        Predicate<Person> predicate,
                                        Consumer<Person> consumer){
        personList.stream().forEach(p->{
            if(predicate.test(p)){
                consumer.accept(p);
            }
        });
    }
}
