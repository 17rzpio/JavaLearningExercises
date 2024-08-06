import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

class OperaComArray{
    public ArrayList<Integer> list = new ArrayList<Integer>();
    public int size;
    public OperaComArray(int length){
        size = length;
        for(int i=0;i<size;i++){
            Random productive = new Random();
            int prizeNumber = productive.nextInt();
            list.add(prizeNumber);
        }
    }
    public int sum(){
        int overallSum=0;
        for(int i=0;i<size;i++) {
            overallSum+= list.indexOf(i);
        }
        return overallSum;
        }

    public int average(){
        int overallSum=0;
        overallSum=list.indexOf(0);
        for(int i=1;i<size;i++) {
            overallSum= (overallSum+list.indexOf(i))/2;
        }
        return overallSum;
        }
    public int last(){
        return list.indexOf(size);

    }
    public int max(){
        int max = list.indexOf(0);
        for(int i=1;i<size;i++)
            if(list.indexOf(i)>size)
                max = list.indexOf(i);
        return max;

    }
    public boolean find(int value) {
        for (int i = 0; i < size; i++)
            if(list.indexOf(i)==value)
                return true;
        return false;
    }
}

public class ine_ex6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {

    }
}
