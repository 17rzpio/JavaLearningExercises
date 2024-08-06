import java.util.Scanner;

public class faccat_ex78 {
    public static void main(String[] args) {
        String vetor[] = new String[10];
        Scanner n = new Scanner(System.in);
        boolean find=false;
        for(int i=0;i<10;i++)
            vetor[i]=n.next();
        String search;
        search = n.next();
        for(int i=0;i<10;i++)
            if(vetor[i].equals(search)){
                System.out.println("find");
                find=true;
            }
        if(find!=true)
            System.out.println("dont fount");

    }
}
