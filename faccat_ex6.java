import java.io.IOException;
import java.util.Scanner;

public class faccat_ex6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        System.out.println("type height");
        int height = myObj.nextInt();
        System.out.println("type length");
        int length = myObj.nextInt();
        int area = height*length;
        System.out.println(area);
    }
}
