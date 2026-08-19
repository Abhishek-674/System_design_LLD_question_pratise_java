package TrafficSignal;

public class Red implements State {
    @Override
    public void change(TrafficLightContext trafficLightContext) {
        System.out.println("Yellow");
        trafficLightContext.setState(new Yellow());
    }
}
