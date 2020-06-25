package CoR.exp2_cor;

public class MainTest {
    public static void main(String[]args){
        CarHandler head = new CarHeadHandler();
        CarHandler body = new CarBodyHandler();
        CarHandler tail = new CarTailHandler();

        //组装顺序设置好 头--》身--》尾
        head.setNextCarHandler(body).setNextCarHandler(tail);
        //body.setNextCarHandler(tail);

        //调用职责链的链头来完成操作
        head.HanlerCar();
    }
}
