import java.util.Scanner;

public class less_number {
    public static void main(String[] args) {
        System.out.println("Type how much numbers");
        Scanner myObj = new Scanner(System.in);
        int size = myObj.nextInt();
        int[] numberOfLess = new int[size];
        int lessNumber = myObj.nextInt();
        numberOfLess[0] = lessNumber;
        for (int i = 1; i < size; i++) {
            numberOfLess[i] = myObj.nextInt();
            if (numberOfLess[i] < lessNumber)
                lessNumber = numberOfLess[i];
        }
        System.out.println(lessNumber);
    }
}