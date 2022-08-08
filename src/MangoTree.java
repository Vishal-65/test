/*Dora is interested so much in gardening and she plants more trees in her garden.
 She plants trees in a rectangular fashion with the order of rows and columns and numbered the trees
  in row-wise order. She planted the mango tree only in a 1st row, 1st column and last column.
  So given the tree number, your task is to find whether the given tree is a mango tree or not?
  Write a program to check whether the given number is a mango tree or not.
  Input consists of 3 integers The first input denotes the number of rows The second input denotes the number of columns
   The third input denotes the tree number, which you have to find whether it's a mango tree or not.
   Case 1:
   Input 5 5 11
   Output yes
 */

import java.util.*;
public class MangoTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int tree=sc.nextInt();
        int a[][]=new int[row][col];
        int k=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=k;
                k++;
            }
        }
        boolean flag=false;
        for(int i=0;i<col;i++){
            if(a[0][i]==tree){
                flag=true;
            }
        }
        for(int i=0;i<row;i++){
            if(a[i][0]==tree){
                flag=true;
            }
        }
        for(int i=0;i<row;i++){
            if(a[i][col-1]==tree){
                flag=true;
            }
        }
        if(flag==true){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
