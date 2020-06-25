package Command.exp4;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> commands = new ArrayList<>();

    public Waiter() {
    }

    public void setOrder(Command c){
        commands.add(c);
    }

    public void removeOrder(Command c){
        commands.remove(c);
    }

    public void sail(){
        for (Command command : commands){
            command.sail();
        }
    }
}
