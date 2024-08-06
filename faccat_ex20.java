import java.io.IOException;
import java.util.Scanner;

public class faccat_ex20 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        int value1 = myObj.nextInt();
        int value2 = myObj.nextInt();
        if(value2>value1){
            System.out.println(value1);
            System.out.println(value2);


        }
        else{
            System.out.println(value2);
            System.out.println(value1);


        }
    }
}
