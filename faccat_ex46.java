import java.util.Scanner;

public class faccat_ex46 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int rating = myObj.nextInt();
        int rating2;
        do{
            rating2 = myObj.nextInt();
            if(rating2==0)
                System.out.println("ill-founded rating");
        }while (rating2==0);

        int result = rating/rating2;
        System.out.println(result);
    }
}
