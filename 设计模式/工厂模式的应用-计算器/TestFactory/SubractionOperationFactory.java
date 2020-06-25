package TestFactory;

public class SubractionOperationFactory implements OperationFactory{

    @Override
    public Operation getOperation() {
        return new SubractionOperation();
    }
}
