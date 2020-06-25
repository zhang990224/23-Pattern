package Interpreter;

public class MinusExpression extends Expression {

    @Override
    public void Interpret(Context context) {
        //提示信息
        System.out.println("自动递减");
        //获得上下文环境
        String input = context.getInput();
        //进行类型转换
        int intInput = Integer.parseInt(input);
        //进行递减
        //intInput++;
        --intInput;
        //对上下文环境重新赋值
        context.setInput(String.valueOf(intInput));
        context.setOutput(intInput);
    }
}
