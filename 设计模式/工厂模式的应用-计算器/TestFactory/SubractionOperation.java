package TestFactory;

public class SubractionOperation extends Operation{
    public double getResult(){
        double result = this.getNum1()-this.getNum2();
        return result;
    }
}
