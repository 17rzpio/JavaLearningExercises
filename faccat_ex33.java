import java.sql.SQLOutput;
import java.util.Scanner;

public class faccat_ex33 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int worth1 = myObj.nextInt();
        int worth2 = myObj.nextInt();
        if(worth2<worth1)
            System.out.println("First is major");
        else if(worth2>worth1)
            System.out.println("Second is major");
        else
            System.out.println("draw");
    }
}
