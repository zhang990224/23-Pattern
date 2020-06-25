package Memento.exp1_fei;

public class MainTest {
    public static void main(String[]args){
        Person p = new Person("lisan","男",20);

        //保存内部状态
        Person backup = new Person();
        backup.setName(p.getName());
        backup.setSex(p.getSex());
        backup.setAge(p.getAge());
        p.display();

        //修改
        p.setAge(25);
        p.display();

        //回滚还原
        p.setName(backup.getName());
        p.setSex(backup.getSex());
        p.setAge(backup.getAge());
        p.display();
    }
}
