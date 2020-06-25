package Strategy.com.strategy;

public class StrategyB implements Strategy{
    @Override
    public double cost(double num) {
        if (num>=200.0){
            return num-50;
        }else{
            return num;
        }
    }
}
