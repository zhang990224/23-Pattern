package State.exp2;


public class Person {
    private int hour;
    private State state;

    public Person() {
        state = new MState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void doSomething(){
        state.doSomething(this);
        state = new MState();
    }
}
