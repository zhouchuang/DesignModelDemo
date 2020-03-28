package Command;

public abstract class Command implements ICommand {


    protected Receiver receiver;
    public Command(Receiver receiver){
        this.receiver = receiver;
    }
}
