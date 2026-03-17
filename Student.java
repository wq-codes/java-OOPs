
  import java.util.Scanner;
class GradeBook{

      int[][] grades;
    String [] subjectName;
    String [] studentName;

    

    public GradeBook( String[] students, String[] subjects) {
        this.grades = new int[students.length][subjects.length];
        this.studentName = students;
        this.subjectName = subjects;
    }

    void Add(int studentIndex,int subjectIndex,int num){
        
             grades[studentIndex][subjectIndex]=num;
           
           System.out.println("Grades:"+grades[studentIndex][subjectIndex]);
       }
       
       
       double getAverage(double mean){
           
           return mean/subjectName.length;
           
           
           
       }
       
       
             
}

   public  class Student{

   public static void main(String[] args) {
       int Grade;
      
       String students[]={"Waqar"};
       
       String subjects[]={"Math","Science"};

         GradeBook gb=new GradeBook(students,subjects);
              Scanner sc=new Scanner(System.in);
        
       
          // Inputting each Student's grades
        for(int i=0; i<students.length; i++){
        
            for(int j=0; j<subjects.length; j++){
                
               System.out.print("Enter Grades of Subject "+(j+1)+":");
                   Grade= sc.nextInt();
                   
                 gb.Add(i,j,Grade);  
            }        
                
    }

       // Calculating Average of specific Student across all subjects  
            double Average=0;    
            for(int i=0; i<1; i++){
        
            for(int j=0; j<subjects.length; j++){
                
                Average+=gb.grades[i][j];
                
            }
          }    
              System.out.println("Average Per Student:"+gb.getAverage(Average));
            
            
            
            
            
            
        }
   }