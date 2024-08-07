import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Scanner;

class Schoolboy{
    public String noun;
    public Double degree1;
    public Double degree2;
    public Double degree3;
    public Schoolboy(){
        noun = " ";
        degree1=0.0;
        degree2=0.0;
        degree3=0.0;

    }

}
public class average_max_degree {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type how much students");
        int size = myObj.nextInt();
        Schoolboy[] a1 = new Schoolboy[size];
        System.out.println("Type the students");
        Double average;
        Double max=0.0;
        String noun="";
        String phrase;
        for(int i=0;i<size;i++){
            a1[i]=new Schoolboy();
            a1[i].noun=myObj.next();
            a1[i].degree1=0.0;
            phrase = br.readLine();
            a1[i].degree1=Double.parseDouble(phrase);
            a1[i].degree2=0.0;
            phrase = br.readLine();
            a1[i].degree2=Double.parseDouble(phrase);
            a1[i].degree3=0.0;
            phrase = br.readLine();
            a1[i].degree3=Double.parseDouble(phrase);
            average = (a1[i].degree1 + a1[i].degree2 + a1[i].degree3)/3;
            if(average>max){
                max=average;
                noun = a1[i].noun;
            }

        }
        System.out.println(max + " " + noun);


    }
    }
