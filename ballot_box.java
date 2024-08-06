import java.io.IOException;
import java.util.Scanner;

class applicant{
    public String name;
    public int number;
    public int amount;
}
public class ballot_box {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Type how much applicant");
        int size = myObj.nextInt();
        applicant[] arrayApplicant = new applicant[size];
        System.out.println("Type the name and number of applicants");
        for(int i=0;i<size;i++){
            arrayApplicant[i] = new applicant();
            arrayApplicant[i].name = myObj.next();
            arrayApplicant[i].number=myObj.nextInt();
        }
        System.out.println("Type the amount of vow");
        int size2 = myObj.nextInt();
        System.out.println("You can poll");
        int[] vow = new int[size2];
        int max=0;
        String maxName="";
        for(int i=0;i<size2;i++){
            vow[i]=myObj.nextInt();

            for(int j=0;j<size;j++)
                if(arrayApplicant[j].number==vow[i])
                    arrayApplicant[j].amount++;
        }



        for(int i=0;i<size;i++)
            if(arrayApplicant[i].amount>max){
                max=arrayApplicant[i].amount;
                maxName=arrayApplicant[i].name;
            }
        System.out.println(maxName + " is winner");

    }

}
