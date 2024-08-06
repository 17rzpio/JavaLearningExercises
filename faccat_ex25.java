import java.io.IOException;
import java.util.Scanner;

public class faccat_ex25 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Scanner myObj = new Scanner(System.in);
        int countNumber = myObj.nextInt();
        int saldo = myObj.nextInt();
        int debit = myObj.nextInt();
        int credit = myObj.nextInt();
        int saldoAtual = saldo -debit + credit;
        if(saldoAtual<0)
            System.out.println("Saldo negativo");
        else
            System.out.println("Saldo positivo");
    }
}
