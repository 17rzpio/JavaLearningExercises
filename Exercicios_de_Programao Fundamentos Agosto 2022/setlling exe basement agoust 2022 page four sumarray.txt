import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        System.out.println("Type how much values");
        Scanner myObj = new Scanner(System.in);
        int size = myObj.nextInt();
        int[] valueForSum = new int[size];
        for(int i=0;i<size;i++)
            valueForSum[i]=myObj.nextInt();
        int sum=0;
        for(int i=0;i<size;i++)
            sum+=valueForSum[i];
        System.out.println(sum);
    }
}
