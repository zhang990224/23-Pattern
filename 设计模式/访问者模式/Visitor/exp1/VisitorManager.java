package Visitor.exp1;

public class VisitorManager implements Vistitor{
    @Override
    public void visit(Park park) {
        System.out.println("管理员：负责公园"+park.getName()+"卫生检查");
    }

    @Override
    public void visit(ParkA parkA) {
        System.out.println("管理员：负责"+parkA.getName()+"公园卫生检查");
    }

    @Override
    public void visit(ParkB parkB) {
        System.out.println("管理员：负责"+parkB.getName()+"公园卫生检查");
    }
}
