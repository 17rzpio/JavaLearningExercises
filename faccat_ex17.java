import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex17 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        System.out.println("type 1 dewgree");
        phrase = br.readLine();
        Double degree1 =Double.parseDouble(phrase);
        System.out.println("type 2 dewgree");
        phrase = br.readLine();
        Double degree2 =Double.parseDouble(phrase);
        Double average = (degree2+degree1)/2;
        if(average>=6.0)
            System.out.println("aproved");
        else
            System.out.println("refused");
        System.out.println(average);
    }
}
