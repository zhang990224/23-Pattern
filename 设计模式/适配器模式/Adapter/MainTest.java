package Adapter;

public class MainTest {
    public static void main(String[] args){
//        Adapter adapter = new Adapter();
//        adapter.user18V();

        Adapter2 adapter = new Adapter2(new Current());
        adapter.user18V();
    }
}
