package Decorator.decorateImpl;

public class SwimCarDecorator extends CarDecorator{
    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.swmim();
    }

    @Override
    public void run() {

    }

    public void swmim(){
        System.out.println("可以游");
    }


}
