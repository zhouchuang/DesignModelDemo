package Command;

public class Start {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ReadCommand readCommand = new ReadCommand(receiver);
        WriteCommand writeCommand = new WriteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.accept(readCommand);
        invoker.accept(writeCommand);
        invoker.execute();
    }
}
