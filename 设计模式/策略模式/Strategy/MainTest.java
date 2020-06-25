package Strategy;

public class MainTest {
    public static void main(String[] args){
        Context context = new Context(new MD5Strategy());
        context.encrypt();
    }
}
