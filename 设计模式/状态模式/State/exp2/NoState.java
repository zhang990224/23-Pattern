package State.exp2;


public class NoState extends State {
    @Override
    public void doSomething(Person person) {
        System.out.println(person.getHour()+"未定义");
    }
}
