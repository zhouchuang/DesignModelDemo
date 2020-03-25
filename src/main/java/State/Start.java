package State;

public class Start {
    public static void main(String[] args) {
        On on = new On();
        Context context = new Context(on);

        context.switchHandler();
        context.switchHandler();
        context.switchHandler();
        context.switchHandler();

    }
}
