package Visitor.exp1;

/*
公园每一部分的抽象
 */
public interface ParkElement {
    //用来接纳访问者
    public void accept(Vistitor vistitor);
}
