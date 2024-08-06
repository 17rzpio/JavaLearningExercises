import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class resemblingWord {
    public static void main(String[] args) throws IOException {
        System.out.println("Type a phrase to count the words");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        System.out.println("Type how words go insert");
        Scanner myObj = new Scanner(System.in);
        int size = myObj.nextInt();
        String[] phrasesResembling = new String[size];

        for(int i =0;i<size;i++) {
            phrasesResembling[i] = br.readLine();
            if(phrasesResembling[i].contains(phrase))
                System.out.println(phrasesResembling[i]);
        }
    }
    }
