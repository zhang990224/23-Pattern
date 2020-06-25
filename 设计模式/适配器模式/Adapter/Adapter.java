package Adapter;

public class Adapter extends Current{
    public void user18V(){
        System.out.println("使用适配器");
        this.user220V();
    }
}
