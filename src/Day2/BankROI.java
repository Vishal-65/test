package Day2;
class SavingAccount{
    String name;
   static int Amount;
    static int time;
    SavingAccount(String name,int Amount,int time){
        this.name=name;
        this.Amount=Amount;
        this.time=time;
    }
    public static int ROISavingAccount(){
        int res= (int) (Amount*time*0.25/100);
        return res;
    }
}
class CurrentAccount {
    String name;
    int Amount;
    int time;
    CurrentAccount(String name,int Amount,int time){
        this.name=name;
        this.Amount=Amount;
        this.time=time;
    }
    public static int ROICurrentAccount(){
       return 0;
    }

}
public class BankROI {
    public static void main(String[] args) {
    SavingAccount Object1=new SavingAccount("Amrita",100000,3);
    CurrentAccount Object2=new CurrentAccount("Gopal",60000,3);
    System.out.println("Amrita Gets the Interest Of : "+Object1.ROISavingAccount());
    System.out.println("Gopal Gets the Interest Of : "+Object2.ROICurrentAccount());
    }
}
