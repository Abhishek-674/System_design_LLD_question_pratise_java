package TrafficSignal;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightContext trafficLight =new TrafficLightContext(new Green());
        while(true){
            trafficLight.change();
            Thread.sleep(5000);
        }
//        trafficLight.change();
//        trafficLight.change();
//        trafficLight.change();
//        trafficLight.change();
//        trafficLight.change();

    }
}
