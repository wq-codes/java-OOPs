import java.util.Scanner;
class Matrices{
  
  public static void input(Scanner sc,double MatrixElements[][]){
    
       for (int i=0; i<MatrixElements.length; i++){
               for (int j=0; j<MatrixElements[i].length; j++){
                 MatrixElements[i][j]=sc.nextDouble();
               
                   
               }
            System.out.println();    
    }
    
  }
  
   public static double[][] AddMatrix(double MatrixElement1[][],double MatrixElement2[][]){
     
     
            double Resultant_Matrix[][]=new double[3][3];
               for (int i=0; i<MatrixElement1.length; i++){
               for (int j=0; j<MatrixElement1[i].length; j++){
                    Resultant_Matrix[i][j]=   MatrixElement1[i][j] + MatrixElement2[i][j];  
                 }
        
   }
             return Resultant_Matrix;
                    
}    }

public class Add2_Matrices{
 
  public static void main(String[] args) {
          
          
     
        double [][] MatrixElement1=new double [3][3];
         double [][] MatrixElement2=new double [3][3];
         Scanner sc=new Scanner(System.in);
      System.out.println("Want to enter 1 Matrix or 2nd:??");
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
      
     System.out.println("Want to enter 1 Matrix or 2nd:??");
          n=sc.nextInt(); 


    }
  
   double[][] Resultant_Matrix= Matrices.AddMatrix(MatrixElement1,MatrixElement2);  
  
    System.out.println("Resultant Matrix:");
  
      for(int i=0; i<Resultant_Matrix.length; i++){
    for(int j=0; j<Resultant_Matrix[i].length; j++){     
         
             System.out.print(Resultant_Matrix[i][j]+" ");
    }
                System.out.println();
      }
  
  }  
}
  