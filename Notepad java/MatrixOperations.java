import java.util.Scanner;
public class MatrixOperations{

public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);
     int[][] Arr= new int [3][3]; 

     System.out.println("Enter input:");
     for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length; j++){
             Arr[i][j]=sc.nextInt();
      }
              }

             System.out.println("Printed Array:"); 
              for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length; j++){
              System.out.print(" "+Arr[i][j] );
  }
           System.out.println();
         
             }

   //Printing sum of Each Row
   System.out.println("Sum of Each Row:");
  
        for(int i=0; i<Arr.length; i++){
       int sum=0;
      for(int j=0; j<Arr[i].length; j++){
         sum+=Arr[i][j];
 }
    System.out.println("Row"+" "+(i+1)+":"+sum);
 }
         System.out.println("Diagonal:");
         for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length; j++){
                if(i==j){
                    System.out.println(Arr[i][j]);
                }
            }
         }
         
         System.out.println("Transposed Matrix:");

   for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length; j++){
                System.out.print(" "+Arr[j][i]);
            }
            System.out.println();
   }

}     }
