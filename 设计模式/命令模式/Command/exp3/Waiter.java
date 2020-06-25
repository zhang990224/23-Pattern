package Command.exp3;

public class Waiter {
    private Command command;

    public Waiter() {
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sail(){
        command.sail();
    }
}
