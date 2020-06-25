package ObServer;

public class MainTest {
    public static void main(String[]args){
        Person p = new Person();
        //注册观察者
        p.addObserver(new MyObServer());
        //删除观察者
        //p.deleteObservers();
        p.setName("zhangsan");
        p.setAge(20);
        p.setSex("男");
    }
}
