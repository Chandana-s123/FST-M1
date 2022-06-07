package Activities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args){
        Set<String> hashset = new HashSet<String>();
        hashset.add("joe");
        hashset.add("ram");
        hashset.add("lee");
        hashset.add("pai");
        hashset.add("kitty");
        hashset.add("mary");

        System.out.println("Size of the set is - " +hashset.size());
        System.out.println("Removing the lee name from set - " +hashset.remove("ram"));
        System.out.println("Removing the name from set which is not present - " +hashset.remove("name"));
        System.out.println("Checking the lee name exists in set - " +hashset.contains("lee"));
        System.out.println("Printing the updated set");
        for (String str: hashset) {
            System.out.println(str);
        }
    }
}
