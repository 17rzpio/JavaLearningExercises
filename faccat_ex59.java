import java.util.Scanner;

public class faccat_ex59 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int read;
        int count=0;
        for(int i =0;i<10;i++){
            read = n.nextInt();
            if(read<0)
                count++;
        }
        System.out.println(count);
    }
}
