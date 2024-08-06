import java.util.Scanner;

public class faccat_ex84 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int size = n.nextInt();
        int vector[]=new int[size];
        int vector2[]=new int[size];
        int vector3[]=new int[size];

        for(int i=0;i<size;i++){
            vector[i]=n.nextInt();
            vector2[i]=n.nextInt();
            vector3[i]=vector[i]+vector2[i];
        }
        for(int i=0;i<size;i++)
            System.out.println(vector3[i]);
    }
}
