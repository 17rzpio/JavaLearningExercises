import java.util.Scanner;

public class faccat_3x36 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int man1 = myObj.nextInt();
        int man2 = myObj.nextInt();
        int agedMan;
        int freshMan;
        if(man1>man2){
            agedMan = man1;
            freshMan = man2;
        }else {
            agedMan = man2;
            freshMan = man1;
        }
        int petticoat1 = myObj.nextInt();
        int petticoat2 = myObj.nextInt();
        int agedpetticoat1;
        int freshMpetticoat1;
        if(man1>man2){
            agedpetticoat1 = petticoat1;
            freshMpetticoat1 = petticoat2;
        }else {
            agedpetticoat1 = petticoat2;
            freshMpetticoat1 = petticoat1;
        }
        int sum1;
        sum1 = agedMan+freshMpetticoat1;
        int mult;
        mult = freshMan*agedpetticoat1;
        System.out.println(sum1);
        System.out.println(mult);
    }
}
