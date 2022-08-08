import java.util.*;
 class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[7];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int tot=0;
        int t=0;
        for(int i=0;i<a.length;i++){
            t+=a[i];
            tot=tot+a[i]*100;
            if(a[i]>8) {
                int temp = a[i] - 8;
                tot = tot + (temp * 15);
            }
        }
        if(t>40){
            int temp1=40-t;
            tot=tot+temp1*25;
        }
        System.out.print(tot);
    }
}
