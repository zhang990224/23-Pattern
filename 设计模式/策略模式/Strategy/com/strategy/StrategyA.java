package Strategy.com.strategy;

public class StrategyA implements Strategy{
    @Override
    public double cost(double num) {
        return num*0.8;
    }
}
