package DataStructur.Assignment.Lab;
import java.util.*;
/**
 * Created by Amjad on 3/20/2022.
 */
public class Assignment2 {

    static void remove(int[] arr)
    {
        Random rnd = new Random();
        while (arr.length > 0)
        {
            int index = rnd.nextInt(arr.length);
            arr[index] = 0;
            System.out.println("The index = " + index + ", The element = " + arr[index] );
            int[] array = new int[arr.length - 1];
            for (int i = 0; i < index; i++)
                array[i] = arr[i];
            for (int i = index; i < arr.length - 1; i++)
                array[i] = arr[i + 1];
            arr = array;
        }
    }
}