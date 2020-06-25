package Visitor.exp1;
/*
公园A部分
 */
public class ParkA implements ParkElement{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(Vistitor vistitor) {
        vistitor.visit(this);
    }
}
