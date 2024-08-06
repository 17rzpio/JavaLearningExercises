import java.util.Scanner;

public class faccat_ex80 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int vector[] = new int[20];
        int max=0;
        int index=0;
        for(int i=0;i<20;i++){
            vector[i]=n.nextInt();
            if(max<vector[i]){
                max = vector[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
