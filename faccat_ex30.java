import java.io.IOException;
import java.util.Scanner;

public class faccat_ex30 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        int value1 = myObj.nextInt();
        int value2 = myObj.nextInt();
        int max;
        int max2=0;
        int min;
        if(value2>value1){
            max = value2;
            min = value1;
        }
        else{
            max = value1;
            min = value2;
        }
        int value3 = myObj.nextInt();
        if(value3>max){
            max2=max;
            max = value3;

        }
        else if(value3<value2){
            max2= value2;
            min = value3;
        }
        else{
            max=value1;
            min = value3;
        }

        System.out.println(min +""+ max2 +""+ max);
    }
}
