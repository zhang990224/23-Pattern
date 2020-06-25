package Mediator.exp2_med;

public class MainTest {
    public static void main(String[]args){
        Mediator m = new Mediator();//相当于中介所
        Person zs = new Man("张三",5,m);
        Person xf = new Woman("小芳",5,m);
        zs.getPartner(xf);
    }
}
