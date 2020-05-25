package Demo.proxy;

public class StaticProxy implements Animal {

    private Dog dog = new Dog();
    @Override
    public void say() {
        System.out.println("代理开始");
        dog.say();
        System.out.println("代理结束");
    }
}
