package DataStructur.Assignment.Lab;

import java.util.Arrays;

/**
 * Created by Amjad on 1/20/2022.
 */
public class Assignment3 {
    public static void main(String[] args)
    {
        int [] arr = {1,2,3,4};
        arr = revers(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] revers(int[] array)
      {
        int [] arr2 = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            arr2[array.length-i-1] = array[i];
        }
        return arr2;
      }

}
