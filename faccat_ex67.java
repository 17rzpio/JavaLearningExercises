import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex67 {
    public static void main(String[] args) throws IOException {
        Double average =15.0;
        Double count=16.0;
        for(int i =16;i<101;i++){
            average = (average+count)/2;
            count = count +1;
        }
        System.out.println(average);
    }
}
