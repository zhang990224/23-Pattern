package Proxy.news;

public class RealSubject implements Subject {
    @Override
    public void sellBook() {
        System.out.println("卖书");
    }
}
