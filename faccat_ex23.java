import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex23 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        System.out.println("type fix payment");
        phrase = br.readLine();
        Double fix =Double.parseDouble(phrase);
        System.out.println("type total sales");
        phrase = br.readLine();
        Double totalSales =Double.parseDouble(phrase);
        Double totalPayment;
        if(totalSales>1500.0)
            totalPayment = fix + (totalSales+totalSales*0.05);
        else
            totalPayment = fix + (totalSales+totalSales*0.03);
        System.out.println(totalPayment);
    }
}
