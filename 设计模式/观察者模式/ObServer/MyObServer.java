package ObServer;

import ObServer.news.Article;

import java.util.Observable;
import java.util.Observer;

public class MyObServer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("对象发生变化");
    }
}
