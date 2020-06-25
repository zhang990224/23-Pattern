package State.exp2;


public class MainTest {
    public static void main(String[]args){
        Person person = new Person();
        person.setHour(19);
        person.doSomething();

        person.setHour(18);
        person.doSomething();
    }
}
