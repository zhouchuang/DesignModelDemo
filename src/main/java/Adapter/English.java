package Adapter;

public class English implements Ien {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void sayShutup() {
        System.out.println("Shut up");
    }
}
