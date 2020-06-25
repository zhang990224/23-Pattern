package Proxy;

public class ProxySubject implements Subject{
    private RealSubject subject;

    public void setSubject(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void sellBook() {
        dazhe();
        this.subject.sellBook();
        give();
    }

    public void dazhe(){
        System.out.println("打折");
    }

    public void give(){
        System.out.println("赠送代金券");
    }
}
