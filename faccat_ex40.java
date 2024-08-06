import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex40 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String portrayal = br.readLine();
        String phrase = br.readLine();
        Double batch = Double.parseDouble(phrase);
        phrase = br.readLine();
        Double rating = Double.parseDouble(phrase);
        Double utter = batch*rating;
        Double rebate;
        if(batch<=5.0)
            rebate=0.02;
        else if (batch>5.0 && batch<=10.0)
            rebate = 0.03;
        else
            rebate=0.05;
        utter = utter - utter*rebate;
        System.out.println(utter);
    }
}
