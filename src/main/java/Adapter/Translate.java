package Adapter;

public class Translate implements Ien ,Icn{
    private Chinese chinese = new Chinese();
    private English english = new English();
    @Override
    public void sayHello() {
        chinese.你好();
    }

    @Override
    public void sayShutup() {
        chinese.闭嘴();
    }

    @Override
    public void 你好() {
        english.sayHello();
    }

    @Override
    public void 闭嘴() {
        english.sayShutup();
    }
}
