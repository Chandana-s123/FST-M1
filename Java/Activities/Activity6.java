package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {

    public static void main(String[] args)  {
        Plane plane = new Plane(10);
        plane.onboard("ABC");
        plane.onboard("XYZ");
        plane.onboard("PQR");


        System.out.println("take-off time : " + plane.takeOff());
        System.out.println("Passengers List: " + plane.getPassesngers());
        //Thread.sleep(5000);
        plane.land();
        System.out.println("land time : " + plane.getLastTimeLanded());
        System.out.println("Landed Passengers List: " + plane.getLastTimeLanded());
    }
}

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    Plane(int maxPassengers){
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }
    void onboard(String passengerName){
        passengers.add(passengerName);

    }
    Date takeOff(){
        return new Date();
    }
    void land(){
        lastTimeLanded = new Date();
        passengers.clear();

    }

    Date getLastTimeLanded(){
        return lastTimeLanded;
    }

    List<String> getPassesngers(){
        return passengers;
    }
}