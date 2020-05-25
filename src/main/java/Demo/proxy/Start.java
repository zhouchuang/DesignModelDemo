package Demo.proxy;

import java.lang.reflect.Proxy;

public class Start {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy();
        staticProxy.say();


        Animal dog = new Dog();
        Animal dogproxy = DynamicsProxy.getProxy(dog);
        dogproxy.say();

    }
}
