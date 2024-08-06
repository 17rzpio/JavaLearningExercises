import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex13 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        System.out.println("type degree one");
        phrase = br.readLine();
        Double degreeOne =Double.parseDouble(phrase);
        System.out.println("type degree two");
        phrase = br.readLine();
        Double degree2 =Double.parseDouble(phrase);
        System.out.println("type degree 3");
        phrase = br.readLine();
        Double degree3 =Double.parseDouble(phrase);
        Double average = (degreeOne*2 + degree2*3 + degree2*5)/10;
        System.out.println(average);
    }
}
