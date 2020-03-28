package Command;

public class WriteCommand extends Command {

    public WriteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.write();
    }
}
