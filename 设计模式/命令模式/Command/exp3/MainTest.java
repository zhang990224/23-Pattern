package Command.exp3;


public class MainTest {
    public static void main(String[]args){
        Peddler peddler = new Peddler();
        Command appleCommand = new AppleCommand(peddler);
        Command bananaCommand = new BananaCommand(peddler);
//        appleCommand.sail();
//        bananaCommand.sail();
        Waiter waiter = new Waiter();
        waiter.setCommand(appleCommand);
        waiter.sail();
        waiter.setCommand(bananaCommand);
        waiter.sail();
    }
}
