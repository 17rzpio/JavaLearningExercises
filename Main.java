import java.util.Scanner;

class objeto{
    public int a;
    public int b;
}
class objeto3{
    public int b;

}
class objeto2{
    public int a;
}
class C<T>{

    public static Object removerPropriedade(objeto a2,String b){
        if (b.equals("a")){
            objeto3 objeto1 = new objeto3();
            objeto1.b=a2.b;
            System.out.println(objeto1.b);
            return objeto1;
        }
        else if (b.equals("b")){
            objeto2 objeto1 = new objeto2();
            objeto1.a=a2.a;
            System.out.println(objeto1.a);
            return objeto1;
        }
        else{
            objeto objeto1 = new objeto();
            objeto1 = a2;
            System.out.println(objeto1.b);
            System.out.println(objeto1.a);
            return objeto1;
        }

    }
}

public class Main {


    public static void main(String[] args)
    {
        objeto a3 = new objeto();
        String b2;
        System.out.println("Type a and b and the delete");
        Scanner myObj = new Scanner(System.in);
        a3.a = Integer.parseInt(myObj.nextLine());
        a3.b = Integer.parseInt(myObj.nextLine());
        b2 = myObj.nextLine();
        Object a4 = new Object();
        a4 = C.removerPropriedade(a3,b2);


        System.out.println("Hello world!");
    }
}