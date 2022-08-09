/*Vignesh loves to play with alphabets and wants to play with Capital letter and Small letter alphabets.
        To make him happy, his father wants to get a code where, when Vignesh gives small letters in a word,
        it gets capitalised and when Vignesh gives capital letters in a word, it gets changed to small letters.
        Vignesh likes to write big sentences and play with. */

package Day2;
import java.util.*;
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String result="";
        for(int i=0;i<input.length();i++){
            if(Character.isUpperCase(input.charAt(i))){
                result=result+Character.toLowerCase(input.charAt(i));
            }
            else{
                result=result+Character.toUpperCase(input.charAt(i));
            }
        }
        System.out.println(result);
    }
}
