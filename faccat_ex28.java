import java.io.IOException;
import java.util.Scanner;

public class faccat_ex28 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
    Scanner myObj = new Scanner(System.in);
    int value1 = myObj.nextInt();
    int value2 = myObj.nextInt();
    int max;
    if(value2>value1)
        max = value2;
    else
        max = value1;
    int value3 = myObj.nextInt();
    if(value3>max)
        max = value3;
    System.out.println(max);
    }
}
