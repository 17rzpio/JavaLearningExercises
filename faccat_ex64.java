import java.util.Scanner;

public class faccat_ex64 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int sum=0;
        int x;
        for(int i =0;i<10;i++)
        {
            x = n.nextInt();
            if(x<40)
                sum = sum + x;

        }
        System.out.println(sum);
    }
}
