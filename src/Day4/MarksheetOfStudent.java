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
       System.out.println(Marksheet.size());
       System.out.println("Marks Of All Subjects:"+Marksheet);
       System.out.println("Total Marks:"+total);
       float percentage=(float)(total/Marksheet.size()*100)*100;
       System.out.println("Percentage: "+percentage);

        // removed the marks of subject-02
        System.out.println("Which element u want to remove");
        int Pos=sc.nextInt();
        try{
            Marksheet.remove(Pos);
            total=total-Marksheet.get(Pos);
        }
        catch(Exception exception){
           System.out.println("Plese give the valid position / give the position less than a Array Size");
        }

        System.out.println(Marksheet.size());
        System.out.println("Marks Of All Subjects:"+Marksheet);
        System.out.println("Total Marks:"+total);
        percentage=(float)total/(Marksheet.size()*100)*100;
        System.out.print("Percentage: "+percentage);
    }
}
