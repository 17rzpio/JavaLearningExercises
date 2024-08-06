import java.util.Scanner;

public class faccat_ex38 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int user = myObj.nextInt();
        boolean entry=false;
        if(user!=1234)
            System.out.println("ill0founded user");
        else
            entry=true;
        int  watchword = myObj.nextInt();
        if (watchword!=9999)
            System.out.println("amiss watchword");
        else if(entry==true)
            System.out.println("entry permitted");
    }
}
