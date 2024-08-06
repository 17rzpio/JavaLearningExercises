import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex85 {
    public static void main(String[] args) throws IOException {
        Double degree[] = new Double[365];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double min;
        Double max;
        Double average;
        String phrase = br.readLine();
        degree[0]=Double.parseDouble(phrase);
        phrase = br.readLine();
        degree[1]=Double.parseDouble(phrase);
        if(degree[0]>degree[1]){
            max = degree[0];
            min=degree[1];
        }
        else{
            max=degree[1];
            min=degree[0];
        }
        average = (degree[0]+degree[1])/2.0;
        for(int i =2;i<365;i++){
            phrase = br.readLine();
            degree[i]=Double.parseDouble(phrase);
            if(degree[i]>max)
                max=degree[i];
            else
                min=degree[i];
            average=(average+degree[i])/2.0;
        }
        int count =0;
        for(int i =0;i<365;i++)
            if(degree[i]<average)
                count++;
        System.out.println(min);
        System.out.println(max);
        System.out.println(average);
        System.out.println(count);
    }
}
