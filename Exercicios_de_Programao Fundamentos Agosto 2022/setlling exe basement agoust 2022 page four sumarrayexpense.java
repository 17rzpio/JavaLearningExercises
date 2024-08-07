import java.util.Scanner;

class enterprise{
    String name;
    String category;
    Double valuation;
    public enterprise(String name2,String category2,Double valuation2){
        name = name2;
        category = category2;
        valuation = valuation2;
    }
}
public class overall_expense {
    public static void main(String[] args) {
        System.out.println("Type how much enterprise");
        Scanner myObj = new Scanner(System.in);
        int size = myObj.nextInt();
        enterprise[] totalEnterprise = new enterprise[size];
        Double sum=0.0;
        for(int i=0;i<size;i++){
            System.out.println("Type name of enterprise");
            String name = myObj.next();
            System.out.println("Type category of enterprise");
            String category = myObj.next();
            System.out.println("Type valuation of enterprise");
            Double valuation = myObj.nextDouble();
            totalEnterprise[i] = new enterprise(name,category,valuation);
            sum+=valuation;
        }
        System.out.println(sum);
    }
}
