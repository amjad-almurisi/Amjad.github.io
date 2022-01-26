package DataStructur.Assignment.Lab;

import java.util.*;


/**
 * Created by Amjad on 1/20/2022.
 */
public class Assignment1 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int [] arrCopy = new int[array.length];
             copy(array,arrCopy);

             System.out.println(Arrays.toString(arrCopy));
    }

    public static int [] copy(int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        return array2;
    }
}
