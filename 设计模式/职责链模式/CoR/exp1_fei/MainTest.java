package CoR.exp1_fei;

public class MainTest {
    public static void main(String[]args){
        CarHandler head = new CarHeadHandler();
        CarHandler body = new CarBodyHandler();
        CarHandler tail = new CarTailHandler();

        head.HanlerCar();
        body.HanlerCar();
        tail.HanlerCar();
    }
}
