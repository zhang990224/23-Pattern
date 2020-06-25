package Visitor.exp1;

public class Park implements ParkElement {
    private String name;
    private ParkA parkA;
    private ParkB parkB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Park() {
        this.parkA = new ParkA();
        this.parkB = new ParkB();
        parkA.setName("越秀");
        parkB.setName("越秀");
    }

    @Override
    public void accept(Vistitor vistitor) {
        vistitor.visit(this);
        parkA.accept(vistitor);
        parkB.accept(vistitor);
    }
}
