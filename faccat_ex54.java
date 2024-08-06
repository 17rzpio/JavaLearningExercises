import java.util.Scanner;

public class faccat_ex54 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int numeral = myObj.nextInt();
        while(numeral==0){
            numeral = myObj.nextInt();
        }
        for(int i =1;i<numeral+1;i++)
            System.out.println(i);
    }
}
