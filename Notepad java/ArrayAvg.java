import java.util.Scanner;
public class ArrayAvg{

  public static void main(String[] args){

    int[][] Arr=new int[2][3];
  
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Input:");
     for(int i=0; i<Arr.length; i++){
          for(int j=0; j<Arr[i].length; j++){
              Arr[i][j]=sc.nextInt(); 
          }
      
}
   System.out.println("Output:");

for (int i = 0; i < Arr.length; i++) {

    int AddingOfRow = 0;

    // calculate sum of row
    for (int j = 0; j < Arr[i].length; j++) {
        AddingOfRow += Arr[i][j];
    }

    // calculate average
    int avg = AddingOfRow / Arr[i].length;

    // print elements greater than average
   
    for (int j = 0; j < Arr[i].length; j++) {
        if (Arr[i][j] > avg) {
            System.out.print(Arr[i][j] + " ");
        }
    }

}

  }

}