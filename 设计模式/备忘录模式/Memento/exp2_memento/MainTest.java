package Memento.exp2_memento;

public class MainTest {
    public static void main(String[]args){
        Person p = new Person("lisan","男",20);
        //Memento memento = p.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(p.createMemento());
        p.display();
        p.setName("wangmeili");
        p.setSex("女");
        p.setAge(20);
        p.display();

        p.setMemento(caretaker.getMemento());
        p.display();



    }
}
