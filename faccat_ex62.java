import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class faccat_ex62 {
    public static void main(String[] args) throws IOException {
        Scanner n = new Scanner(System.in);
        int size = n.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        Double numeral = Double.parseDouble(phrase);
        Double average = numeral;
        for(int i=1;i<size;i++){
            phrase = br.readLine();
            numeral = Double.parseDouble(phrase);
            average = (average+numeral)/2;
        }
        System.out.println(average);

    }
}
