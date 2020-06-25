package Command.exp2;

public class MainTest {
    public static void main(String[]args){
        Peddler peddler = new Peddler();
        Command appleCommand = new AppleCommand(peddler);
        Command bananaCommand = new BananaCommand(peddler);
        appleCommand.sail();
        bananaCommand.sail();
    }
}
