import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex72 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        Double average = Double.parseDouble(phrase);
        Double max = average;
        Double num;
        for(int i=1;i<15;i++){
            phrase = br.readLine();
            num = Double.parseDouble(phrase);
            if(max<num)
                max=num;
            average = (average+num)/2.0;
        }
        System.out.println(max);
        System.out.println(average);
    }
}
