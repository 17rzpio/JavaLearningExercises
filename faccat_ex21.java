import java.io.IOException;
import java.util.Scanner;

public class faccat_ex21 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        int startHour = myObj.nextInt();
        int finalHour = myObj.nextInt();
        if(finalHour-startHour<1)
            finalHour+=24;
        int totalHour = finalHour - startHour;
        System.out.println(totalHour);
    }
}
