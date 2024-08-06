import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class ArrayExemplo {
    public ArrayList<Integer> arrayInt = new ArrayList<Integer>();
    public int sizeA;

    public ArrayExemplo(int lengthA) {
        sizeA = lengthA;

        for (int i = 0; i < sizeA; i++) {
            Random productive = new Random();
            int prizeNumber = productive.nextInt(50);
            arrayInt.add(prizeNumber);
        }
    }
    public ArrayExemplo(){
        Random productive = new Random();
        int prizeNumber = productive.nextInt(9,21);
        for (int i = 0; i < prizeNumber; i++) {
            Scanner myObj = new Scanner(System.in);
            arrayInt.add(myObj.nextInt());
        }
    }
    public void print(){
        for(int a:arrayInt)
            System.out.println(a);
    }
}
public class ine_ex8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
    }
}
