import java.util.Scanner;

public class Four_Exercise_Page_three {
    public static void main(String[] args) {
        System.out.println("Type how much values");
        Scanner myObj = new Scanner(System.in);
        int size = myObj.nextInt();
        int[] evenValues = new int[size];
        System.out.println("Type the array");
        for(int i =0;i<size;i++)
            evenValues[i] = myObj.nextInt();
        System.out.println("Even values of index and nominal in array");
        for(int i =0;i<size;i++)
            if(evenValues[i]%2==0 && i%2==0)
                System.out.println(evenValues[i]);
    }
}
