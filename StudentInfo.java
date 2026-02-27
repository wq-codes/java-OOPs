 class student{

//attributes,field1s
    String name;
   static public String Uni_name;
   int roll_no;
   float marks;
  static int student_Count=0;
    final int MAX_MARKS=100;
 

//methods



    static int  getcount(){
          return student_Count; 
}



  student(String name, String Uni_name,int roll_no, float marks){

        this.name=name;
        this.Uni_name=Uni_name;
        this.roll_no=roll_no;
        this.marks=marks;     
         student_Count++;
}

void  displayInfo(){
     
      System.out.println("Name is "+ name + "\nObtained Marks:"+ marks +  "\nUniversity Name is:"+ Uni_name+ "\nRoll No:"+ roll_no);
}

 void showMaxMarks(){

        System.out.println("Maximum Marks:"+MAX_MARKS);
 }





char calculateGrade(float marks){
     if(marks>=90)
     return 'A';
    
     if(marks>=80)
     return 'B';

     if(marks>=70)
     return 'C';
 
    if(marks>=60)
     return 'D';
   
     else 
      return 'F';
}

          static void Display(int TotalStudent){
                    System.out.println("University Name:"+ student.Uni_name+ "\nTotal Student Are:"+TotalStudent);
}
}
 
      public class StudentInfo{
  
      public static void main(String  [] args){


             student S1=new student("WAQAR","COMSATS",143,97.5f);

               S1.displayInfo();

          S1.showMaxMarks();
          char grade=  S1.calculateGrade(S1.marks);
           System.out.println("Grade:"+grade);

           student.Display(student.getcount());
    }
}
  
                  

    













