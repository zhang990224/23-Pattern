package Mediator.exp1_fei;

public class MainTest {
    public static void main(String[]args){
        Person zs = new Man("张三",3);
        Person ls = new Man("李四",5);
        Person xl = new Woman("小丽",3);
        Person xf = new Woman("小芳",5);

        zs.getPartner(ls);
        ls.getPartner(xl);
        ls.getPartner(xf);
    }
}
