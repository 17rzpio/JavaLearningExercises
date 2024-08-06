import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class faccat_ex69 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        Double average = Double.parseDouble(phrase);
        Double num;
        do{

            phrase = br.readLine();
            num = Double.parseDouble(phrase);
            average = (average + num)/2;
            System.out.println("further commodity?");
            phrase = br.readLine();
        }while(phrase.equals("s"));
        System.out.println(average);

    }
}
