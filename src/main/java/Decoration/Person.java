package Decoration;

/**
 * @author zhouchuang
 * @create 2020-03-22 21:30
 */
public class Person {
    private String name;

    public Person(){

    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.print("装扮的"+name);
    }
}
