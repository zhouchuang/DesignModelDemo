package Demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Object target;
    public ProxyHandler(Object target){
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"动态开始");
        method.invoke(target,args);
        System.out.println(method.getName()+"动态结束");
        return null;
    }
}
