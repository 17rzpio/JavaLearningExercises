import java.util.Scanner;

public class faccat_ex42 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int numeral = myObj.nextInt();
        int annoBirth = myObj.nextInt();
        int annoEntranceBusiness = myObj.nextInt();
        if((((2023-annoBirth)>=65) && ((2023-annoEntranceBusiness)>=30)) ||(((2023-annoBirth)>=60) && ((2023-annoEntranceBusiness)>=25)))
            System.out.println("request retirement");
        System.out.println(2023-annoBirth);
        System.out.println(2023-annoEntranceBusiness);
    }
}
