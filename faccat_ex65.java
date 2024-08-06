import java.util.Scanner;

public class faccat_ex65 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int numeral = n.nextInt();
        int numeral2 = n.nextInt();
        int sum=0;
        for(int i =numeral;i<numeral2+1;i++)
            sum = sum +i;
        System.out.println(sum);
    }
}
