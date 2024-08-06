import javax.swing.*;
import java.util.Scanner;

class employment{
    public String name;
    public String employment;

}
public class Third_Exercise_Page_three_Fundamental_Exercise_Agoust {
    public static void main(String[] args) {
        System.out.println("Type object values");
        Scanner myObj = new Scanner(System.in);
        String name = (myObj.nextLine());
        employment Value = new employment();
        Value.name = name;
        String employment = (myObj.nextLine());
        Value.employment = employment;
        String[][] objectPara = new String[2][2];
        objectPara[0][0]="name";
        objectPara[0][1]=Value.name;
        objectPara[1][0]="employment";
        objectPara[1][1]=Value.employment;
        System.out.println(objectPara[0][0]);
        System.out.println(objectPara[0][1]);
        System.out.println(objectPara[1][0]);
        System.out.println(objectPara[1][1]);
    }
}
