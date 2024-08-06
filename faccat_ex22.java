import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex22 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        System.out.println("type hours worked");
        phrase = br.readLine();
        Double hours =Double.parseDouble(phrase);
        System.out.println("type price of hours worked");
        phrase = br.readLine();
        Double hoursPrice =Double.parseDouble(phrase);
        Double payment;
        Double extra;
        if(hours>40){
            hours = hours - 40;
            extra = hours*hoursPrice+ hours*hoursPrice*0.5;
            payment = 40*hoursPrice+extra;
        }
        else
            payment = hours*hoursPrice;
        System.out.println(payment);
    }
}
