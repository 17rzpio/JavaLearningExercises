import java.util.Scanner;

public class faccat_ex88 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int vector[] = new int[20];
        for(int i=0;i<20;i++)
            vector[i]=n.nextInt();
        int number = n.nextInt();
        int vector2[] = new int[19];
        int size=0;
        boolean exists=false;
        for(int i=0;i<20;i++)
            if(vector[i]==number){
                for(int j=0;j<i-1;j++)
                    vector2[j] = vector[j];
                exists=true;
                size=i;
            }
        if(exists==true){
            for(int i=size+1;i<19;i++)
                vector2[i]=vector[i-1];
            for(int i=0;i<19;i++)
                System.out.println(vector2[i]);
        }
        else
            for (int i=0;i<20;i++)
                System.out.println(vector[i]);


    }
}
