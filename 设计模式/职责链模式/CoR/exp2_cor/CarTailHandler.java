package CoR.exp2_cor;

public class CarTailHandler extends CarHandler {
    @Override
    public void HanlerCar() {
        System.out.println("组装车尾");
        if (this.carHandler != null){
            this.carHandler.HanlerCar();
        }
    }
}
