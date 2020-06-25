package Decorator.decorateImpl;

public class RunCar implements Car {
    @Override
    public void show() {
        this.run();
    }

    @Override
    public void run() {
        System.out.println("可以跑");
    }
}
