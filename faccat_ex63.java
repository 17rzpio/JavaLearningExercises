import java.util.Scanner;

public class faccat_ex63 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int sum=0;
        for(int i =0;i<10;i++)
            sum = sum + n.nextInt();
        System.out.println(sum);
    }
}
