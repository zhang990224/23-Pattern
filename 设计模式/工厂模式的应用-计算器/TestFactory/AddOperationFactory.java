package TestFactory;

public class AddOperationFactory implements OperationFactory{

    @Override
    public Operation getOperation() {
        return new AddOperation();
    }
}
