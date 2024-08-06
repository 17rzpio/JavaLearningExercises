import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        System.out.println("Type the height of triangle");
        Scanner myObj = new Scanner(System.in);
        int height = myObj.nextInt();
        int length = myObj.nextInt();
        int area = (height*length)/2;
        System.out.println(area);
    }
    }
