package ObServer.news;

import java.util.Observable;

public class BolgUser extends Observable {
    public void publishBlog(String title,String content){
        Article a = new Article();
        a.setContent(content);
        a.setTitle(title);
        System.out.println("博主发布新文章，标题："+title+",内容："+content);
        this.setChanged();
        this.notifyObservers(a);//将内容也发送到观察者
    }
}
