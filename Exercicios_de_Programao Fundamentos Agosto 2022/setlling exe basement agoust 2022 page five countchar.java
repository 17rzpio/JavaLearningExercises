import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class repeatchar {
    public static void main(String[] args) throws IOException {
        System.out.println("Type a phrase to count the words");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        int count=0;
        Scanner myObj = new Scanner(System.in);
        String countChar1 = myObj.next();
        char countChar = countChar1.charAt(0);
        char [] ch = new char[phrase.length()];
        for(int i=0;i<phrase.length();i++){
            ch[i]=phrase.charAt(i);
        }
        for (char c:ch)
            if(c==countChar)
                count++;
        System.out.println(count);
    }
}
