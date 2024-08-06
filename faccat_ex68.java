import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class faccat_ex68 {
    public static void main(String[] args) throws IOException {
        Scanner n = new Scanner(System.in);
        int amount = n.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        Double average = Double.parseDouble(phrase);
        Double num;
        for(int i =1;i<amount;i++)
        {
            phrase = br.readLine();
            num = Double.parseDouble(phrase);
            average = (average + num)/2;
        }
        System.out.println(average);
    }
}
