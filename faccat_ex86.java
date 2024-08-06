import java.util.Scanner;

public class faccat_ex86 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int vector[] = new int[10];
        vector[0]=n.nextInt();
        int swap;
        for(int i=1;i<10;i++)
            vector[i]=n.nextInt();
        for(int i=0;i<10;i++)
            for(int j=1;j<10;j++){
                if(vector[j-1]>vector[j]){
                    swap = vector[j-1];
                    vector[j-1]=vector[j];
                    vector[j] = swap;
                }
            }


        for(int i=0;i<10;i++)
            System.out.println(vector[i]);
    }
}
