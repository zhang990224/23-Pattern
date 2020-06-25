package Proxy.news;

import java.lang.reflect.Proxy;

public class MainTest {
    public static void main(String[]args){
        RealSubject subject = new RealSubject();
        MyHandler myHandler = new MyHandler();
        myHandler.setSubject(subject);

        Subject proxy = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),subject.getClass().getInterfaces(),myHandler);
        proxy.sellBook();
    }
}
