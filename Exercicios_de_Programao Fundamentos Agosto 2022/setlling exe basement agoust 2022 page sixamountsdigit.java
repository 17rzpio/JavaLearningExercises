import java.io.IOException;
import java.util.Scanner;

public class amount_digit {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Type how much values");
        int size = myObj.nextInt();
        System.out.println("Type the values");
        String[] numbers = new String[size];
        for(int i =0;i<size;i++)
            numbers[i]=myObj.next();
        System.out.println("Type the amount of digit");
        int amount_digit_value = myObj.nextInt();
        for(int i=0;i<size;i++)
            if(numbers[i].length()==amount_digit_value)
                System.out.print(numbers[i]);


    }
    }
