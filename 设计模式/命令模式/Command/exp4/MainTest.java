package Command.exp4;

public class MainTest {
    public static void main(String[]args){
        Peddler peddler = new Peddler();
        Command appleCommand = new AppleCommand(peddler);
        Command bananaCommand = new BananaCommand(peddler);
        Waiter waiter = new Waiter();
        //下订单
        waiter.setOrder(appleCommand);
        waiter.setOrder(bananaCommand);
        //移除订单
        waiter.removeOrder(appleCommand);
        waiter.sail();
    }
}
