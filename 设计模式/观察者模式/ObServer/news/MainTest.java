package ObServer.news;

public class MainTest {
    public static void main(String[]args){
        BolgUser user = new BolgUser();
        user.addObserver(new MyObServer());
        user.publishBlog("随便写写","一寸光阴一寸金!");
    }
}
