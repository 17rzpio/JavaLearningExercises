import java.io.IOException;
import java.util.Scanner;

public class ine_ex2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        int[] array = new int[8];
        int max=0;
        int position=0;
        for (int i = 0; i < 8; i++){
            array[i] = myObj.nextInt();
            if(array[i]>max){
                max=array[i];
                position=i;
            }
        }
        position++;
        System.out.println(position);
    }
}
