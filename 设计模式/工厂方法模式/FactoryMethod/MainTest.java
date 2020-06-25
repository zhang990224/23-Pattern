package FactoryMethod;

/**
 * 简单工厂模式属于类的创建模式，又称静态工厂方法模式
 * 通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类
 */
public class MainTest {
    public static void main(String[]args){
        //获得AppleFactory
        FruitFactory f1 = new AppleFactory();
        //通过AppleFactory来获得Apple实例
        Fruit apple = f1.getFruit();
        apple.getF();

        //获得BananaFactory
        FruitFactory f2 = new BananaFactory();
        //通过BananaFactory来获得Banana实例
        Fruit banana = f2.getFruit();
        banana.getF();

        //获得PearFactory
        FruitFactory f3 = new PearFactory();
        //通过PearFactory来获得Pear实例
        Fruit pear = f3.getFruit();
        pear.getF();
    }
}
