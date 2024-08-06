import java.util.Scanner;

public class faccat_ex56 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        for(int i=0;i<11;i++)
            System.out.println(i*number);
    }
}
