package CoR.exp2_cor;

public class CarBodyHandler extends CarHandler {
    @Override
    public void HanlerCar() {
        System.out.println("组装车身");
        if (this.carHandler != null){
            this.carHandler.HanlerCar();
        }
    }
}
