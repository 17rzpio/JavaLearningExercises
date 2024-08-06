import java.util.Scanner;

public class faccat_ex70 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int numeral = n.nextInt();
        int numeral2 = n.nextInt();
        int max;
        int min;
        if(numeral>numeral2){
            max = numeral;
            min = numeral2;
        }else{
            max = numeral2;
            min = numeral;
        }

        for(int i =2;i<100;i++){
            numeral = n.nextInt();
            if(numeral>max)
                max=numeral;
            if(numeral<min)
                min = numeral;

        }
        System.out.println(max);
        System.out.println(min);
    }
}
