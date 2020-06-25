package Proxy;

public class MainTest {
    public static void main(String[]args){
        RealSubject subject = new RealSubject();
        //subject.sellBook();

        ProxySubject proxySubject = new ProxySubject();
        proxySubject.setSubject(subject);
        proxySubject.sellBook();
    }
}
