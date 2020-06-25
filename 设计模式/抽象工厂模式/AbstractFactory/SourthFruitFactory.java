package AbstractFactory;

public class SourthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new SourthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SourthBanana();
    }
}
