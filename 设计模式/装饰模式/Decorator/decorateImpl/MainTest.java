package Decorator.decorateImpl;

public class MainTest {
    public static void main(String[]args){
        Car car = new RunCar();
        Car swim = new SwimCarDecorator(car);
        Car fly = new FlyCarDecorator(swim);
        fly.show();
    }
}
