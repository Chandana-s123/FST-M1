package Activities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] list = {6, 7, 2, 8, 3, 5, 1, 0};
        System.out.println("Array list before sorting " + Arrays.toString(list));
        System.out.println("Array list After sorting " + Arrays.toString(InsertionSort(list)));
    }

    public static int[] InsertionSort(int arrayList[]){
        int temp;
        for(int i =1 ;i<arrayList.length;i++){
            for(int j=0;j<i;j++){
               if(arrayList[i]<arrayList[j]){
                   temp = arrayList[i];
                   arrayList[i] = arrayList[j];
                   arrayList[j] = temp;
               }

            }

        }
        return arrayList;



    }
}
