package Day3;
import java.lang.*;
import java.util.*;
class AirportException extends Exception{
    public AirportException(String message){
        super(message);
    }
}
class Passengers{
    static String name;
    float luggage_weight;
    String place;
    Passengers(String name, Float luggage_weight, String place){
        this.name=name;
        this.luggage_weight=luggage_weight;
        this.place=place;

    }
    public static void Weight_Checker(float luggage_weight){
        try{
            if(luggage_weight > 15){
                throw new AirportException("Your luggage weight is More than 15kg,You have to Pay for remaining Weight Price");
            }
            System.out.println("Your Luggage is Correct , Happy Journey!!!");
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        finally{
            float temp=luggage_weight-15;
            System.out.println(name+" Should Have To Pay Amount : "+temp*500);
        }
    }
}

public class AirportLuggage {
    public static void main(String[] args) {
        Passengers passenger1=new Passengers("Bhavya",18.0f,"Canada");
        Passengers passenger2=new Passengers("Sruthi",15.01f,"USA");
        passenger1.Weight_Checker(18.0f);
        System.out.println("");
        passenger2.Weight_Checker(15.01f);


    }
}

