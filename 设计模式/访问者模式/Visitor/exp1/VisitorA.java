package Visitor.exp1;
/*
清洁工A，负责公园A部分
 */
public class VisitorA implements Vistitor{
    @Override
    public void visit(Park park) {

    }

    @Override
    public void visit(ParkA parkA) {
        System.out.println("清洁工A：完成"+parkA.getName()+"公园的卫生");

    }

    @Override
    public void visit(ParkB parkB) {

    }
}
