package Mediator.exp1_fei;

public class Man extends Person {
    public Man(String name, int condition) {
        super(name, condition);
    }

    @Override
    public void getPartner(Person person) {
        if (person instanceof Man){
            System.out.println("抱歉，我喜欢女生");
        }else{
            if (this.getCondition() == person.getCondition()){
                System.out.println(this.getName()+" 和 "+person.getName()+" 匹配");
            }else{
                System.out.println(this.getName()+" 和 "+person.getName()+" 不匹配");
            }
        }
    }


}
