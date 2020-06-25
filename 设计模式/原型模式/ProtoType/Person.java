package ProtoType;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{//实现这个接口才能被克隆
    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private String sex;
    //朋友
    private List<String> friends;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person clone(){
        try {
            Person person = (Person) super.clone();
            List<String> friends = new ArrayList<>();
            for (String friend:this.getFriends()){
                friends.add(friend);
            }
            person.setFriends(friends);
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
