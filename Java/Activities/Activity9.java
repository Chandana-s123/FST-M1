package Activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args){
        List<String> myList = new ArrayList<String>();
        myList.add("joe");
        myList.add("ram");
        myList.add("lee");
        myList.add("pai");
        myList.add("kitty");
        for (String str: myList) {
            System.out.println(str);
        }
        System.out.println("3rd name in the list - " +myList.get(2));
        System.out.println("Verify list contains pai name - " +myList.contains("pai"));
        System.out.println("Size of the list is - " +myList.size());
        System.out.println("Removing the lee name from list - " +myList.remove("ram"));
        System.out.println("Size of the list after removing one name - " +myList.size());
    }
}
