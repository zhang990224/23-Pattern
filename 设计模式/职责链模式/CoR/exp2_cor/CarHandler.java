package CoR.exp2_cor;

public abstract class CarHandler {
    protected CarHandler carHandler;//设置成protected子类才能调用到

//    public void setNextCarHandler(CarHandler carHandler){
//        this.carHandler = carHandler;
//    }
    //两种写法，有返回值的可以比较简便
    public CarHandler setNextCarHandler(CarHandler carHandler){
        this.carHandler = carHandler;
        return carHandler;
    }

    public abstract void HanlerCar();
}
