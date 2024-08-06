import java.io.IOException;
import java.util.Scanner;

public class faccat_ex26 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
    Scanner myObj = new Scanner(System.in);
    int qntdAtual = myObj.nextInt();
    int qntMax = myObj.nextInt();
    int qntdMin = myObj.nextInt();
    int qntMiddle = (qntMax+qntdMin)/2;
    if(qntdAtual<qntMiddle)
        System.out.println("Não efetua compra");
    else
        System.out.println("Efetuar compra");
    }
}
