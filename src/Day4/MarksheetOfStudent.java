package Day4;
import java.util.*;

public class MarksheetOfStudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ArrayList<Integer> Marksheet = new ArrayList<>();
       int subjects=sc.nextInt();
       int total=0;
       for(int position=0;position<subjects;position++){
           Marksheet.add(sc.nextInt());
           total=total+Marksheet.get(position);
       }
       
       System.out.println("Marks Of All Subjects:"+Marksheet);
       System.out.println("Total Marks:"+total);
       double percentage=(double)(total/500*100);
       System.out.print("Percentage: "+percentage);
    }
}
