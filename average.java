import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        System.out.println("Type how much number");
        Scanner myObj = new Scanner(System.in);
        int size = myObj.nextInt();
        int[] arrayValues = new int[size];
        int average=0;
        for(int i =0;i<size;i++){
            arrayValues[i]=myObj.nextInt();
            average = (arrayValues[i]+average)/2;
        }
        System.out.println(average);
    }
}
