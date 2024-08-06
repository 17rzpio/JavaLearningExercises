import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ine_ex5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        Double[] array = new Double[20];
        for (int i = 0; i < 20; i++){
            phrase = br.readLine();
            array[i]=Double.parseDouble(phrase);
        }
        Double average=array[0];
        for (int i = 1; i < 20; i++)
            average = (average + array[i])/2;
        for (int i = 0; i < 20; i++)
            if(array[i]<average)
                System.out.println(array[i]);

    }
}
