import java.util.Scanner;

public class faccat_ex82 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x[]=new int[10];
        for(int i =0;i<10;i++)
            x[i]=n.nextInt();
        int y = n.nextInt();
        int z[]=new int[10];
        for(int i=0;i<10;i++)
            z[i]=x[i]*y;
        for(int i=0;i<10;i++)
            System.out.println(z[i]);
    }
}
