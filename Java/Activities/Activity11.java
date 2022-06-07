package Activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args){
        Map<Integer,String> colors = new HashMap<Integer,String>();
        colors.put(1,"RED");
        colors.put(2, "BLUE");
        colors.put(3,"ORANGE");
        colors.put(4,"PINK");
        colors.put(5,"YELLOW");
        System.out.println("Map: " + colors);
        System.out.println("Remove orange color - " + colors.remove(3,"ORANGE"));
        System.out.println("Check if GREEN color exists - " + colors.containsValue("GREEN"));
        System.out.println("Size of the map - "+colors.size());


    }
}
