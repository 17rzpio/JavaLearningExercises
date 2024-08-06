public class faccat_ex76 {
    public static void main(String[] args) {
        for(int i=0;i<60;i++)
            System.out.print("+");
        for(int i=0;i<8;i++){
            System.out.println("");
            System.out.print("+");
            for(int j=0;j<58;j++)
                System.out.print("_");
            System.out.print("+");
        }
        System.out.println("+");
        for(int i=0;i<59;i++)
            System.out.print("+");
    }
}
