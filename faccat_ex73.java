import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex73 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        Double average = Double.parseDouble(phrase);
        int count=0;
        if(average<150.0)
            count++;
        Double max = average;
        Double num;
        for(int i=1;i<15;i++){
            phrase = br.readLine();
            num = Double.parseDouble(phrase);
            if(max<num)
                max=num;
            average = (average+num)/2.0;
            if(num<150.0)
                count++;
        }
        System.out.println(max);
        System.out.println(average);
        Double rating = (count/15.0)*100.0;
        System.out.println(rating);

        phrase = br.readLine();
        Double average2 = Double.parseDouble(phrase);

        Double num2;
        for(int i=1;i<15;i++){
            phrase = br.readLine();
            num = Double.parseDouble(phrase);

            average = (average+num)/2.0;

        }
        System.out.println(average);
    }
}
