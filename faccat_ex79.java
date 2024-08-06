import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex79 {
    public static void main(String[] args) throws IOException {
        Double vector[]= new Double[20];
        int count =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        vector[0] = Double.parseDouble(phrase);
        Double average = vector[0];
        for(int i=1;i<20;i++){
            phrase = br.readLine();
            vector[i] = Double.parseDouble(phrase);
            average = (average + vector[i])/2.0;
        }
        for(int i=0;i<20;i++)
            if(vector[i]>average)
                count++;
        System.out.println(average);
        System.out.println(count);
    }
}
