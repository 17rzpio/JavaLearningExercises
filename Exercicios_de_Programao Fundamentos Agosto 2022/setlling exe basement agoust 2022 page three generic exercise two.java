import java.util.Scanner;
class array<T extends Object>{
    public static Object[] getArray(int size) {
        Object[] genericArray = new Object[size];
        for(int i=0;i<size;i++) {
            Scanner myObj = new Scanner(System.in);
            String a = myObj.nextLine();
            try {
                double d = Double.parseDouble(a);
                genericArray[i] = d;
            } catch (NumberFormatException nfe) {
            }
        }
        return genericArray;
    }
}
public class Second_Exercise_Page_three {
    public static void main(String[] args) {
        int size;
        Scanner myObj = new Scanner(System.in);
        size = Integer.parseInt(myObj.nextLine());
        Object array2[]=new Object[size];
        array2 = array.getArray(size);
        int size2 = array2.length;
        for(int i =0;i<size2;i++)
            System.out.println(array2[i]);
    }

}
