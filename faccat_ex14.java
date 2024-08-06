import java.io.IOException;
import java.util.Scanner;

public class faccat_ex14 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
    Scanner myObj = new Scanner(System.in);
    int number = myObj.nextInt();
    if(number>10)
        System.out.println("É MAIOR DO QUE 10!");
    else
        System.out.println(("NÃO É MAIOR DO QUE 10!"));
    }
}
