import java.util.Scanner;

public class management {
    public static void main(String[] args) {

        student[] team=new student[3];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <= team.length-1; i++) {
            int id=in.nextInt();
            String name=in.next();
            student s=new student(id,name);
            team[i]=s;
        }
        for (int i = 0; i <=team.length-1 ; i++) {
            System.out.println(team[i].toString());
        }
    }
}
