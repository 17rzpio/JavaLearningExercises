import java.util.Scanner;

public class faccat_ex81 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int vector[] = new int[20];
        vector[0]=n.nextInt();
        int min=vector[0];
        int index=0;
        for(int i=1;i<20;i++){
            vector[i]=n.nextInt();
            if(min>vector[i]){
                min = vector[i];
                index = i+1;
            }
        }
        System.out.println(min);
        System.out.println(index);
    }
}
