import java.io.IOException;

public class faccat_ex1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
    int A=10;
    int B=20;
    int C;
    C=A;
    A=B;
    B=C;
    System.out.println(A);
    System.out.println(B);
    }
}
