package Bridge.exp3_bridge;

public class Bus extends Car{
    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.println("Bus:");
        this.getEngine().installEgine();
    }
}
