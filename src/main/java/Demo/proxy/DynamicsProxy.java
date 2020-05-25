package Demo.proxy;

import java.lang.reflect.Proxy;

public class DynamicsProxy<T> {
    public  static <T> T  getProxy(T target){
        ProxyHandler proxyHandler = new ProxyHandler(target);
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),  target.getClass().getInterfaces() , proxyHandler);
    }
}
