import java.util.Scanner;

public class faccat_ex83 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int vector[] = new int[20];
        for(int i=0;i<20;i++)
            vector[i]=n.nextInt();
        for(int i=19;i>=0;i--)
            System.out.println(vector[i]);
    }
}
