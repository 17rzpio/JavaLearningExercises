import java.util.Scanner;

public class faccat_ex89 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int v1[]=new int[15];
        int v2[]=new int[15];
        int count=0;
        for(int i=0;i<15;i++){
            v1[i] = n.nextInt();
            v2[i] = n.nextInt();
            if(v1[i]==v2[i])
                count++;
        }
        System.out.println(count);
    }
}
