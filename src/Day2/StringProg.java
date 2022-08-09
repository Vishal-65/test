package Day2;
import java.util.*;
public class StringProg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input1=sc.nextLine();
        String input2=sc.nextLine();
        System.out.println("String Length input1: "+input1.length());
        System.out.println("String Length input2: "+input2.length());
        String merge =input1+input2;
        System.out.println("Merge of input1 and input2: "+ merge);
        System.out.println("Split of input2: "+ input2.substring(2,5));
        if(input1.equals(input2)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not equal");
        }
        StringBuffer sb=new StringBuffer(input1);
        sb.reverse();
        System.out.println("Reverse Of Input1 "+ sb);


    }
}
