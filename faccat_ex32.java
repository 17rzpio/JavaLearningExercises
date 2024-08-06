import java.io.IOException;
import java.util.Scanner;

public class faccat_ex32 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        String lineup1 = myObj.next();
        int goal1 = myObj.nextInt();
        String lineup2 = myObj.next();
        int goal2 = myObj.nextInt();
        if (goal2>goal1)
            System.out.println(lineup2);
        else if(goal1>goal2)
            System.out.println(lineup1);
        else
            System.out.println("draw");
    }
}
