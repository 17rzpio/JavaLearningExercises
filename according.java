import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class according {
    public static void main(String[] args) throws IOException {
        System.out.println("Type a phrase to delete vowel");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        char [] ch = new char[phrase.length()];
        for(int i=0;i<phrase.length();i++)
            if(phrase.charAt(i)!='a' && phrase.charAt(i)!='e' && phrase.charAt(i)!='i' && phrase.charAt(i)!='o' && phrase.charAt(i)!='u') {
                ch[i] = phrase.charAt(i);
                System.out.println(ch[i]);
            }

    }
}
