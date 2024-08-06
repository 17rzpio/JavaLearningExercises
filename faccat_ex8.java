import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class faccat_ex8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase;
        System.out.println("type constituent");
        phrase = br.readLine();
        Double constituent =Double.parseDouble(phrase);
        System.out.println("type valid vow");
        phrase = br.readLine();
        Double suffrage =Double.parseDouble(phrase);
        System.out.println("type blank vow");
        phrase = br.readLine();
        Double blankVow =Double.parseDouble(phrase);
        System.out.println("type inept vow");
        phrase = br.readLine();
        Double ineptVow =Double.parseDouble(phrase);
        Double blankVote = (blankVow/constituent)*100;
        Double nullVote = (ineptVow/constituent)*100;
        Double suffrageVote = (suffrage/constituent)*100;
        System.out.println("blank vote"+blankVote);
        System.out.println("nullVote vote"+nullVote);
        System.out.println("suffrageVote vote"+suffrageVote);
    }
}
