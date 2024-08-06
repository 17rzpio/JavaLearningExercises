import java.util.Scanner;

public class faccat_ex91 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int vector[]=new int[5];
        int count=0;

        for(int i=0;i<5;i++)
            vector[i]=n.nextInt();
        for(int i=0;i<5;i++)
            for(int j=0;j<i;j++)
                if(vector[i]==vector[j])
                    count++;
        System.out.println(count);
    }
}
