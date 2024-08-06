import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        System.out.println("Type year");
        Scanner myObj = new Scanner(System.in);
        int leapYear = myObj.nextInt();

        if(leapYear>399)
            if(leapYear%400==0)
                System.out.println("Is leap year");
            else if (leapYear%100!=0 && leapYear%4==0)
                System.out.println("Is leap year");
            else
                System.out.println("Not is leap year");
        else if (leapYear%100!=0 && leapYear%4==0)
            System.out.println("Is leap year");
        else
            System.out.println("Isn't leap year");
    }
}
