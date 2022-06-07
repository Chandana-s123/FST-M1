package Activities;

import java.awt.*;

public class Activity1 {
    public  static void main(String[] args){
        Car eon = new Car();
        eon.make = 2014;
        eon.color = "Black";
        eon.transmission = "Manual";
        eon.displayCharacteristics();
        eon.accelarate();
        eon.brake();
    }

}

class Car{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car() {
        tyres = 4;
        doors = 4;
    }
    public void displayCharacteristics() {
        System.out.println("Color: "+ color);
        System.out.println("transmission: "+ transmission);
        System.out.println("tyres: "+ tyres);
        System.out.println("doors: "+ doors);

    }
    public void accelarate() {
        System.out.println("Car is moving");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }

}






