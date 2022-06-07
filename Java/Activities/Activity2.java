package Activities;

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args){
        int[] numberList = {10, 77, 10, 54, -11, 10};
        System.out.println("sum of all the 10's in the array "+ Arrays.toString(numberList)+" is exactly 30. " + sum(numberList));
    }
    public static boolean sum(int[] list) {
        int sum = 0;
        for (int i:list){
            if(i == 10)
                sum = sum+10;
        }
        if(sum == 30)
            return true;
        else
            return false;

    }

}
