import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class second_bigger_value {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("type how much value");
        int size = myObj.nextInt();
        int[] numbers = new int[size];
        System.out.println("Type the values");
        numbers[0]=myObj.nextInt();
        numbers[1]=myObj.nextInt();
        int biggerFirst;
        int biggerSecond;
        if(numbers[1]>numbers[0]){
            biggerSecond = numbers[0];
            biggerFirst = numbers[1];
        }
        else{
            biggerSecond = numbers[0];
            biggerFirst = numbers[1];
        }
        for(int i=1;i<size;i++){
            numbers[i]=myObj.nextInt();
            if(numbers[i]>biggerFirst){
                biggerSecond = biggerFirst;
                biggerFirst = numbers[i];
            }
            else if (numbers[i]>biggerSecond){
                biggerSecond = numbers[i];
            }
        }
        System.out.println(biggerSecond);
    }
    }
