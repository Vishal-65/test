import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        int m1=x-n;
        int m2=y-n;
        int m3=z-x;

        String res="";
        if((m1<m2 && m1>=0) && (m1<m3 && m1>=0) ){
            res="L1";
        }
        else if((m2<m1 && m2>=0) && (m2<m3 && m2>=0) ){
            res="L2";
        }
        else if((m3<m1 && m3>=0) && (m3<m2 && m3>=0) ){
            res="L3";
        }
        System.out.print(res);

    }
}
