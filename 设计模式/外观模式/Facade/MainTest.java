package Facade;

public class MainTest {
    public static void main(String[]args){
        //实现A子系统功能
        //SystemA systemA = new SystemA();
        //systemA.doSomething();

        Facade facade = new Facade();
        facade.doAB();
    }
}
