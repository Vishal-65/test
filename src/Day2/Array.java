package Day2;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Minimum Marks:"+a[0]);
        System.out.print("Maximum Marks:"+a[size-1]);
    }
}
