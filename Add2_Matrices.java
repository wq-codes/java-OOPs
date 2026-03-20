import java.util.Scanner;
class Matrices{
  //Inputting Both Matrix
  public static void input(Scanner sc,double MatrixElements[][]){
    
       for (int i=0; i<MatrixElements.length; i++){
               for (int j=0; j<MatrixElements[i].length; j++){
                 MatrixElements[i][j]=sc.nextDouble();
               
                   
               }
               
    }
    
  }
  
   public static void AddMatrix(double MatrixElement1[][],double MatrixElement2[][]){
     
     
           
               for (int i=0; i<MatrixElement1.length; i++){
               for (int j=0; j<MatrixElement1[i].length; j++){
                    System.out.print( MatrixElement1[i][j] + MatrixElement2[i][j]+" ");  
                 }
           System.out.println();
   }
                    
}      
    //Printing the Inputted Matrix
      public static void output(double MatrixElement[][]){
    for (int i=0; i<MatrixElement.length; i++){
       for(int j=0; j<MatrixElement[i].length; j++){
            System.out.print(MatrixElement[i][j]+" ");
    }  
        System.out.println();
    }

      }
        }

public class Add2_Matrices{
 
  public static void main(String[] args) {
          
          
     
        double [][] MatrixElement1=new double [3][3];
         double [][] MatrixElement2=new double [3][3];
         Scanner sc=new Scanner(System.in);
      System.out.println("Want to enter 1 Matrix or 2nd (0 to exit)?");
         int n=sc.nextInt(); 
  
    while (n!=0){
      
          switch(n){

   case 1:
           System.out.println("Enter 1st Matrix:");
              Matrices.input(sc,MatrixElement1);
       break;
       
       
   case 2:
           System.out.println("Enter 2nd Matrix:");
              Matrices.input(sc,MatrixElement2);
       break;
  default:
      System.out.println("Invalid Choice");
    break;
}
      
     System.out.println("Want to enter 1 Matrix or 2nd (0 to exit)?");
          n=sc.nextInt(); 


    }
  
     

    Matrices.output(MatrixElement1);
    System.out.println("     +");
  Matrices.output(MatrixElement2);

  System.out.println("Resultant Matrix is:");
    
    //Adding Both Matrices
    Matrices.AddMatrix(MatrixElement1,MatrixElement2); 
    
    // System.out.println("Resultant Matrix:");
  
    //   for(int i=0; i<Resultant_Matrix.length; i++){
    // for(int j=0; j<Resultant_Matrix[i].length; j++){     
         
    //          System.out.print(Resultant_Matrix[i][j]+" ");
    // }
    //             System.out.println();
    //   }
  
  }  
}
  