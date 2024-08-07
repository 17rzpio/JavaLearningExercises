import java.util.Random;
import java.util.Scanner;

public class raffleNumber {
    public static void main(String[] args) {
        System.out.println("Type a number for raffle");
        Scanner myObj = new Scanner(System.in);
        int numberRaffle = myObj.nextInt();
        Random productive = new Random();
        int prizeNumber = productive.nextInt(11);
        if(prizeNumber==numberRaffle)
            System.out.println("You win!");
        else
            System.out.println("You lose");
    }
    }
