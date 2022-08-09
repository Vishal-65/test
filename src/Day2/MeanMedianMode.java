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
        System.out.println("Mean:"+ Mean);
        System.out.println("Median:"+ Median);
        System.out.println("Mode:"+ Mode);

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
        Arrays.sort(arr);
        int array_length=arr.length;
        if(array_length%2==1){
            return arr[array_length/2];
        }
        else{
            return (arr[array_length/2] +arr[array_length/2+1])/2;
        }
    }
    public static int FindMode(int arr[]) {
        Arrays.sort(arr);
        int mini = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (mini < count) {
                    mini = count;
                    res = arr[i];
                }
            }

        }
        return res;
    }
}
