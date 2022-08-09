package Day2;
import java.util.*;
public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int Mean=FindMean(arr);
        int Median=FindMedian(arr);
        int Mode=FindMode(arr);

    }
    public static int FindMean(int arr[]){
        int array_length=arr.length;
        int sum_elements=0;
        for(int i=0;i<arr.length;i++){
            sum_elements=sum_elements+arr[i];
        }
        return sum_elements/array_length;
    }
    public static int FindMedian(int arr[]){
        int array_length=arr.length;
        if(array_length%2==1){
            return arr[array_length/2];
        }
        else{
            return (arr[array_length/2] +arr[array_length/2+1])/2;
        }
    }
    
}
