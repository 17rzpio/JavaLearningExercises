import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class faccat_ex37 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        Double strawberry = Double.parseDouble(phrase);
        phrase = br.readLine();
        Double litter = Double.parseDouble(phrase);
        Double stawberryWage;
        if (strawberry>5)
            stawberryWage = 2.2;
        else
            stawberryWage = 2.5;
        Double litterWage;
        if (litter>5)
            litterWage = 1.5;
        else
            litterWage = 1.8;
        Double entire = strawberry*stawberryWage +litter*litterWage;
        if((litter+strawberry)>8.0 || entire>25.0)
            entire = entire - entire*0.1;
        System.out.println(entire);
    }
}
