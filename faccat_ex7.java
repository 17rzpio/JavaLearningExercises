import java.io.IOException;
import java.util.Scanner;

public class faccat_ex7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        System.out.println("type year old");
        int ageYear = myObj.nextInt();
        System.out.println("type month old");
        int ageMonth = myObj.nextInt();
        System.out.println("type day old");
        int ageDay = myObj.nextInt();
        int totalYear = ageYear*365+ageMonth*30+ageDay;
        System.out.println(totalYear);

    }
}
