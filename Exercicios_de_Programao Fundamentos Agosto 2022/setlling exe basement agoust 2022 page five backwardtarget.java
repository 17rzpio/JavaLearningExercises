import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.lang.reflect.Field;
class a{
    public String a;
    public String b;
}

public class backward_target {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);

        String a2 = myObj.next();

        String b2 = myObj.next();


        a a3 = new a();


        a3.a = a2;

        a3.b = b2;

        Hashtable<String, String> a7 = new Hashtable<String, String>();
        a7.put("a",a2);
        a7.put("b",b2);
        Hashtable<String, String> reversedProps = new Hashtable<String, String>();

        System.out.println(a7);

        for(String key:a7.keySet())
            reversedProps.put(a7.get(key),key);

        System.out.println(reversedProps);
//
//        System.out.println(a3.a + " " + a3.b);
//        Class<?> clazz = a3.getClass();
//        Field[] fieldlist = clazz.getDeclaredFields();
//        String[] a4 = new String[2];
//        Object a5 = new Object();
//        for (int i  = 0; i < fieldlist.length; i++) {
//             a4[i]= fieldlist[i].getName();
//        }
//        Object a6 = new Object();
//        for (int i  = 0; i < fieldlist.length; i++) {
//           // a4[i]= fieldlist[i].set(a5,a4[i]);
//            fieldlist[i].set(a6,a3);
//        }

        //field.set(object, fieldValue);
       // String a4 = a3.a.getName();
    }
}
