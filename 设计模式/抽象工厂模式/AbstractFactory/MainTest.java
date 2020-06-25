package AbstractFactory;

public class MainTest {
    public static void main(String []args){
        FruitFactory ff = new NorthFruitFactory();
        Fruit apple = ff.getApple();
        apple.getF();

        Fruit banana = ff.getBanana();
        banana.getF();
    }
}
