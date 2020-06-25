package ObServer.news;

import java.util.Observable;
import java.util.Observer;

public class MyObServer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Article a = (Article)arg;
        System.out.println("博主发布新文章啦，快去看");
        System.out.println("文章标题："+a.getTitle());
        System.out.println("文章内容："+a.getContent());
    }
}
