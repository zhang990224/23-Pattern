package SimpleFactory;

public class FruitFactory {

    /*
    获取Apple类的实例
     */
    public static Fruit getApple(){
        return new Apple();
    }

    /*
    获取Banana类实例
     */
    public static Fruit getBanana(){
        return new Banana();
    }

    /*
    get方法，获得所有产品对象
     */
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        if (type.equalsIgnoreCase("apple")){
//            return Apple.class.newInstance();
//        }else if ((type.equalsIgnoreCase("banana"))){
//            return Banana.class.newInstance();
//        }else{
//            System.out.println("找不到对应的实例对象");
//            return null;
//        }
        System.out.println(type);
        Class fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }
}
