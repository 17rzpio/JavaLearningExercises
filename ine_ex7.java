import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Profe {
    public ArrayList<String> listNoun = new ArrayList<String>();
    public ArrayList<Integer> listCraftTense = new ArrayList<Integer>();
    public int sizeA;
    public int sizeB;

    public Profe(int lengthA, int lengthB) {
        sizeA = lengthA;
        sizeB = lengthB;
        System.out.println("Type a noun of beak");
        for (int i = 0; i < sizeA; i++) {
            Scanner myObj = new Scanner(System.in);
            listNoun.add(myObj.next());
        }
        System.out.println("Type a crafttense of beak");
        for (int i = 0; i < sizeB; i++) {
            Scanner myObj = new Scanner(System.in);
            listCraftTense.add(myObj.nextInt());
        }
    }
}
public class ine_ex7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        System.out.println("Type a size of beak");
        Scanner myObj = new Scanner(System.in);
        int sizeA = myObj.nextInt();
        System.out.println("Type a size of CRAFT TENSE of beak");
        int sizeb = myObj.nextInt();
        Profe profe = new Profe(sizeA,sizeb);
        for(String a:profe.listNoun)
            System.out.println(a);
        for(int a: profe.listCraftTense)
            System.out.println(a);
        }
    }

