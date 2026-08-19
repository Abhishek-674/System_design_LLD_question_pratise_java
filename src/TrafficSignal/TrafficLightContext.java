package TrafficSignal;

public class TrafficLightContext {
    State currentState;
    public TrafficLightContext(State currentState) {
        this.currentState = currentState;
    }

    void setState(State state) {
        this.currentState = state;
    }
    void change()
    {
        currentState.change(this);
    }

}
