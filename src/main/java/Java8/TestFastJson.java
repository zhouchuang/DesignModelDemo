package Java8;

import com.alibaba.fastjson.JSON;

public class TestFastJson {
    public static void main(String[] args) {

        Person p  = new Person();
        p.setAge(112);
        p.setName("tom");
        System.out.println(JSON.toJSONString(p));
        Person p2 =   JSON.parseObject(JSON.toJSONString(p), Person.class);
        System.out.println(p2);
    }
    static class Person{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
