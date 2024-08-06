import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex35 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        Double bulkSold = Double.parseDouble(phrase);
        String firing = br.readLine();
        Double charge;
        if(firing.equals("A"))
            if(bulkSold<=20.0)
                charge = 3.3*bulkSold - (2.9*bulkSold*0.3);
            else
                charge = 3.3*bulkSold - (2.9*bulkSold*0.5);
        else
            if(bulkSold<=20.0)
                charge = 3.3*bulkSold - (3.3*bulkSold*0.4);
            else
                charge = 3.3*bulkSold - (3.3*bulkSold*0.6);
        System.out.println(charge);
    }
}
