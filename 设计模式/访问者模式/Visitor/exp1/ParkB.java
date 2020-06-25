package Visitor.exp1;
/*
公园B部分
 */
public class ParkB implements ParkElement{
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
