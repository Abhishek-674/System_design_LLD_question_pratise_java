package TrafficSignal;

public class Green implements State{
    @Override
    public void change(TrafficLightContext trafficLightContext) {
        System.out.println("RED");
        trafficLightContext.setState(new Red());

    }
}
