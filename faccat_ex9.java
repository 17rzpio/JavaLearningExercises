import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        System.out.println("type wage");
        phrase = br.readLine();
        Double wage =Double.parseDouble(phrase);
        System.out.println("type readjustment");
        phrase = br.readLine();
        Double readjustment =Double.parseDouble(phrase);
        Double newWage = wage+ wage*(readjustment/100);
        System.out.println(newWage);
    }
}
