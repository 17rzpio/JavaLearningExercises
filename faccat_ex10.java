import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        System.out.println("type plant expenditure");
        phrase = br.readLine();
        Double plantExpenditure =Double.parseDouble(phrase);
        Double finalExpense = plantExpenditure+plantExpenditure*(28.0/100.0)+plantExpenditure*(45.0/100.0);
        System.out.println(finalExpense);
    }
}
