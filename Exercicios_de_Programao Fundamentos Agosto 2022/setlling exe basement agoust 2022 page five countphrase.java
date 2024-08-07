import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class words_phrase {
    public static void main(String[] args) throws IOException {
        System.out.println("Type a phrase to count the words");
//        Scanner myObj = new Scanner(System.in);
//        String phrase = myObj.next();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String phrase= br.readLine();
        int count=1;
        char [] ch = new char[phrase.length()];
        for(int i=0;i<phrase.length();i++){
            ch[i]=phrase.charAt(i);
        }
        for (char c:ch)
            if(!Character.isLetter((c)))
                count++;

        System.out.println(count);
        //String[] words = phrase.split("\\s+");
        //System.out.println(words.length);
//        StringTokenizer tokens = new StringTokenizer(phrase);
//        System.out.println(tokens.countTokens());
    }
    }
