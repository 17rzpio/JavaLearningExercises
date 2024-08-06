import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class faccat_ex41 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        Double grade1 = Double.parseDouble(phrase);
        phrase = br.readLine();
        Double grade2= Double.parseDouble(phrase);
        phrase = br.readLine();
        Double grade3= Double.parseDouble(phrase);
        phrase = br.readLine();
        Double meanWorkout= Double.parseDouble(phrase);
        Double meanUse = (grade1+grade2*2+grade3*3+meanWorkout)/7;

        if(meanUse<6.0)
            System.out.println("D");
        else if(meanUse<7.5)
            System.out.println("C");
        else if(meanUse<9.0)
            System.out.println("B");
        else
            System.out.println("A");
    }
}
