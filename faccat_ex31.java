import java.io.IOException;
import java.util.Scanner;

public class faccat_ex31 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        int value1 = myObj.nextInt();
        int value2 = myObj.nextInt();
        int value3 = myObj.nextInt();
        if(value1+value2>value3 && value2+value3>value1 && value1+value3>value2)
            System.out.println("is triangle");
        else
            System.out.println("not is trianglu");
    }
    }
