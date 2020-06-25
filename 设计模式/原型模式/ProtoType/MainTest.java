package ProtoType;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String []args){
        Person p1 = new Person();
        p1.setName("zhangsan");
        p1.setAge(20);
        p1.setSex("男");
        List<String> friends = new ArrayList<String>();
        friends.add("wangwu");
        friends.add("小李");
        p1.setFriends(friends);

        //Person p2 = p1;
        //两个意思不一样，克隆知识数据相同，不是指向同一个对象
        Person p2 = p1.clone();
//        System.out.println(p2.getName());
//        System.out.println(p2.getAge());
//        System.out.println(p2.getSex());
        System.out.println(p1.getFriends());
        System.out.println(p2.getFriends());

        friends.add("shazi");
        p1.setFriends(friends);
        //浅度克隆引用时是引用同一个地址
        System.out.println(p1.getFriends());
        System.out.println(p2.getFriends());
    }
}
