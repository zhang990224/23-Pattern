package Interpreter;

public class MainTest {
    public static void main(String[]args){
        String number = "10";
        Context context = new Context(number);

        Expression expression = new PlusExpression();
        expression.Interpret(context);
        System.out.println(context.getInput());

        Context context2 = new Context(context.getInput());
        Expression expression2 = new MinusExpression();
        expression2.Interpret(context2);
        System.out.println(context2.getInput());
    }
}
