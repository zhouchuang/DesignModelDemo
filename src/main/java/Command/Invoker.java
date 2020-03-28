package Command;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Invoker implements ICommand{
    List<Command> list  = new ArrayList<Command>();
    public void accept(Command command){
        System.out.println(LocalTime.now()+command.getClass().getSimpleName());
        list.add(command);
    }

    public void execute(){
        for(Command command : list){
            command.execute();
        }
    }
}
