package FactoryMethod;

public class PearFactory implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
