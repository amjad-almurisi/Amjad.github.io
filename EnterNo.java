import java.util.Scanner;


public class EnterNo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [] array =new int[4];
        for (int i = 0; i <= array.length-1; i++) {
            array[i]=input.nextInt();

        }
        for (int i = 0; i <=array.length-1 ; i++) {
            System.out.println(array[i]+"\t");
        }
    }
}
