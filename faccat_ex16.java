import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class faccat_ex16 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        System.out.println("type how much apple");
        phrase = br.readLine();
        Double apple =Double.parseDouble(phrase);
        Double price;
        if(apple<12.0)
            price = apple*1.3;
        else
            price = apple;
        System.out.println(price);
    }
}
