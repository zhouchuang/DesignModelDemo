package Command;

public class ReadCommand extends Command {
    public ReadCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.read();
    }
}
