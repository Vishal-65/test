import java.util.*;
public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=0;j<=i;j++){
                System.out.print(c1+" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(c2+" ");
            }
            System.out.println();
        }
    }
}
