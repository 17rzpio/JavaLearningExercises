import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        System.out.println("type plant instalmentLorryNegotiate");
        phrase = br.readLine();
        Double instalmentLorryNegotiate =Double.parseDouble(phrase);
        System.out.println("type total Negotiate");
        phrase = br.readLine();
        Double totalNegotiate =Double.parseDouble(phrase);
        System.out.println("type payment fix");
        phrase = br.readLine();
        Double paymentFix =Double.parseDouble(phrase);
        System.out.println("type value per car");
        phrase = br.readLine();
        Double valuePerCar=Double.parseDouble(phrase);
        Double totalPayment = paymentFix + instalmentLorryNegotiate*valuePerCar+(5.0/100.0)*totalNegotiate;
        System.out.println(totalPayment);
    }
}
