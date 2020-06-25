package Singleton;

public class MainTest {
    public static void main(String[]args){
        Person4 p1 = Person4.getPerson();
        Person4 p2 = Person4.getPerson();

        p1.setName("zhang");
        p2.setName("li");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
