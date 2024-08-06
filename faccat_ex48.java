import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex48 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        Double grade = Double.parseDouble(phrase);
        while(grade<0.0 || grade>10.0){
            phrase = br.readLine();
            grade = Double.parseDouble(phrase);
        }
        phrase = br.readLine();
        Double grade2 = Double.parseDouble(phrase);
        while(grade2<0.0 || grade2>10.0){
            phrase = br.readLine();
            grade2 = Double.parseDouble(phrase);
        }
        Double average;
        average = (grade+grade2)/2.0;
        System.out.println(average);
    }
}
