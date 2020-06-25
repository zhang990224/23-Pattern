package Bridge.exp3_bridge;

public class MainTest {
    public static void main(String[]args){
        Engine e2000 = new Engine2000();
        Car bus = new Bus(e2000);
        bus.installEngine();
        Engine e2200 = new Engine2200();
        Car jeep = new Jeep(e2200);
        jeep.installEngine();
    }
}
