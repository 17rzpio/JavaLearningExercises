import java.io.IOException;
import java.util.Scanner;

public class faccat_ex27 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
    Scanner myObj = new Scanner(System.in);
    int number = myObj.nextInt();
    if(number>0)
        System.out.println("plump");
    else if(number==0)
        System.out.println("zero");
    else
        System.out.println("minus");
    }
}
