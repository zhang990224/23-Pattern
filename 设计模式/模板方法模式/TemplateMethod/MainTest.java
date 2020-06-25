package TemplateMethod;

public class MainTest {
    public static void main(String[]args){
        MakeCar bus = new MakeBus();
//        bus.makeBody();
//        bus.makeHead();
//        bus.makeTail();
        bus.make();
        System.out.println("--------------");
        MakeCar jeep = new MakeJeep();
//        jeep.makeBody();
//        jeep.makeHead();
//        jeep.makeTail();
        jeep.make();
    }
}
