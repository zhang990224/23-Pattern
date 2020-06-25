package FlyWeight.news;

public class MainTest {
    public static void main(String[]args){
        TeacherFactory factory = new TeacherFactory();
        Teacher t1 = factory.getTeacher("201721314324");
        Teacher t2 = factory.getTeacher("201721314325");
        Teacher t3 = factory.getTeacher("201721314324");
        Teacher t4 = factory.getTeacher("201721314326");

        System.out.println(t1.getNumber());
        System.out.println(t2.getNumber());
        System.out.println(t3.getNumber());
        System.out.println(t4.getNumber());

        if (t1 == t3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
