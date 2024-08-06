import java.io.IOException;
import java.util.Scanner;

public class faccat_ex15 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        if(number<0)
            System.out.println("is negative");
        else
            System.out.println("is positive");
    }
}
