package Java8;

public abstract class TestAbstract {
    abstract String get();
    public void print(){
        System.out.println("字符串长度："+this.get().length());
    }
}
