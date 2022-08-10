package Day3;
import java.util.*;
class ElectionException extends Exception{
    public ElectionException(String message){
        super(message);
    }
}

public class Election {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Nominee Age = ");
        int age=sc.nextInt();
        try{
            if(age<25){
                throw new ElectionException("Nominee's Age is Less than 25,Cannot participate in Nomination.");
            }
            System.out.println("You are the Nominee, You Can participate in Nomination");
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
