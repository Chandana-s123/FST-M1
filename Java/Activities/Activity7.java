package Activities;


interface BicycleParts{
    public int gears = 0;
    public int speed = 0;
}
interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts,BicycleOperations{
    public int gears;
    public int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }


    public void applyBrake(int increaseSpeed){
        currentSpeed = speed+increaseSpeed;
        System.out.println("Increased speed to: " + currentSpeed);
    }

    public void speedUp(int decreaseSpeed){
        currentSpeed = speed+decreaseSpeed;
        System.out.println("Decreased speed to: " + currentSpeed);
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gears, int currentSpeed) {
        super(gears, currentSpeed);
    }

    public MountainBike(int gears, int currentSpeed, int seatHeightOfBicycle){
        super(gears,currentSpeed);
        seatHeight = seatHeightOfBicycle;

    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc(){
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed+ "\nSeat height of vehical is " + seatHeight);
    }
}

public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(5, 30, 5);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(30);
        mb.applyBrake(20);
    }
}
