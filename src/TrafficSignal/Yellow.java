package TrafficSignal;

public class Yellow implements State {
    @Override
    public void change(TrafficLightContext trafficLightContext) {
        System.out.println("Green");
        trafficLightContext.setState(new Green());
    }
}
