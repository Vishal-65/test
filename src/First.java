import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        for(int i=0;i<3;i++){
          a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int maxi=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
          int smallest=a[i]-x;
          if(maxi>smallest && smallest>0){
              maxi=smallest;

          }
        }

        if(x+maxi==a[0]){
            System.out.print("L1");
        }
        else if(x+maxi==a[1]){
            System.out.print("L2");
        }
        else{
            System.out.print("L3");
        }

    }
}
