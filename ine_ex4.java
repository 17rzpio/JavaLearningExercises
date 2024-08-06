import java.io.IOException;
import java.util.Scanner;

public class ine_ex4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++)
            array[i] = myObj.nextInt();
        int[] array2 = new int[5];
        int j=4;
        for (int i = 0; i < 5 && j>0; i++){
            array2[j]=array[i];
            j--;

        }
        for (int i = 0; i < 5; i++){
            System.out.println(array[i]);
            System.out.println(array2[i]);
        }
    }
}
