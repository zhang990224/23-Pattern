package Visitor.exp1;

public class MainTest {
    public static void main(String[]args){
        Park park = new Park();
        park.setName("越秀");
        VisitorA visitorA = new VisitorA();
        park.accept(visitorA);
    }
}
