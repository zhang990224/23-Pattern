package CoR.exp2_cor;

public class CarHeadHandler extends CarHandler {
    @Override
    public void HanlerCar() {
        System.out.println("组装车头");
        if (this.carHandler != null){
            this.carHandler.HanlerCar();
        }
    }
}
