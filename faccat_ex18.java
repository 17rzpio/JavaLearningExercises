import java.io.IOException;
import java.util.Scanner;

public class faccat_ex18 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
    Scanner myObj = new Scanner(System.in);
    int nowYear = myObj.nextInt();
    int oldYear = myObj.nextInt();
    if(nowYear-oldYear>15)
        System.out.println("can vow");
    else
        System.out.println("cannot vow");
    }
}
