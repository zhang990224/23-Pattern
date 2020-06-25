package Strategy.com.strategy;

public class MainTest {
    public static void main(String[] args) {
        Context context = new Context(new StrategyB());
        double newNum = context.cost(200);
        System.out.println("实际到账："+newNum+"元");
    }
}
