package SimpleFactory;

/**
 * 简单工厂模式属于类的创建模式，又称静态工厂方法模式
 * 通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类
 */
public class MainTest {
    public static void main(String[]args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//        Fruit apple = new FruitFactory().getApple();
//        apple.getF();
//        Fruit banana = FruitFactory.getFruit("banana");
//        banana.getF();
        Fruit banana = FruitFactory.getFruit("SimpleFactory.Banana");
        banana.getF();
    }
}
