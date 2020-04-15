package Java8;

//饿汉模式
public class Single {

    private static Single instance = new Single();
    private Single(){
        if(instance!=null){
            throw new RuntimeException();
        }
    }
    public static Single getInstance(){
        return instance;
    }
}
//饱汉模式
class Single2{
    private Single2(){

    }
    private static Single2 instance;
    public static Single2 getInstance(){
        if(instance==null){
            synchronized (Single2.class){
                if(instance==null){
                    instance  = new Single2();
                }
            }
        }
        return instance;
    }
}
//静态内部类实现饱汉模式
class Single3{
    private Single3(){

    }
    private static class SingletonInstance{
        private static final Single3 instance = new Single3();
    }
    public static Single3 getInstance(){
        return SingletonInstance.instance;
    }
}
//枚举方式
enum Single4{
    Instance;
    private Single4(){

    }
}