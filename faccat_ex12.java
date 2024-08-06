import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        System.out.println("type degree fahrenheit");
        phrase = br.readLine();
        Double fahrenheit =Double.parseDouble(phrase);
        Double celsius = 5*((fahrenheit-32)/9);
        System.out.println(celsius);
    }
}
