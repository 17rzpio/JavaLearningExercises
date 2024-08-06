import java.util.Scanner;

public class faccat_ex90 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int vector[]=new int[5];
        int count=0;
        int number;
        for(int i=0;i<5;i++)
            vector[i] = n.nextInt();
        number = n.nextInt();
        for(int i=0;i<5;i++)
            if(vector[i]==number)
                count++;
        System.out.println(count);
    }
}
