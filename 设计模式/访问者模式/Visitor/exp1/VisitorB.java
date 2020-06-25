package Visitor.exp1;
/*
清洁工A，负责公园A部分
 */
public class VisitorB implements Vistitor{
    @Override
    public void visit(Park park) {

    }

    @Override
    public void visit(ParkA parkA) {

    }

    @Override
    public void visit(ParkB parkB) {
        System.out.println("清洁工B：完成"+parkB.getName()+"公园的卫生");
    }
}
