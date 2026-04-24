class Student{

   private String name;
   private int rollNo;

  //setter
   void setName(String name){
   this.name=name;

   }
   //getter
    String getname(){

      return name;
    }
//setter
   void setRollNo(int rollNo){
   this.rollNo=rollNo;

   }
//getter
   int getrollNo(){
    return rollNo;
   }

   Student(String name, int rollNo){

   this.name=name;
   this.rollNo=rollNo;
   

   }
 @Override
 public String toString(){

   return name+"|"+"RollNO#:"+rollNo;


 }
  //copy constructor
   Student (Student other){
     this.name=other.name;
       this.rollNo=other.rollNo;
  
   }
}


class Date{

   private int date;
   private int  month;
  private  int year;

// DATE
public int getDate() {
    return date;
}

public void setDate(int date) {
     if (date >= 1 && date <= 31) {
        this.date = date;
    } else {
        System.out.println("Invalid date! Date must be between 1 and 31.");
    }
}

// MONTH
public int getMonth() {
    return month;
}

public void setMonth(int month) {
  if (month>=1 && month<=12){
    this.month=month;
}  else {
   System.out.println("Invalid");
}
}

// YEAR
public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}
//parameterized Constructor
   Date(int date,int month,int year){
  
     this.date=date;
     this.month=month;
     this.year=year;

   }

   //Display Method
   @Override
   public String toString(){
             return date+"/"+month+"/"+year;
   }
//copy constructor
Date (Date other){

   this.date=other.date;
    this.month=other.month;
    this.year=other.year;
}
    
}


class Course{

String courseName;
String courseCode;

Student enrolledStudent;
Date enrollmentDate;

//parameterized constructor
Course(String courseName, String courseCode,Student enrolledStudent,Date enrollmentDate){

     this.courseName=courseName;
     this.courseCode=courseCode;

     this.enrolledStudent=new Student(enrolledStudent);
   
   this.enrollmentDate=new Date(enrollmentDate);


}
 void DisplayCourseInfo(){
  
        System.out.println("====Course Information====");
        System.out.println("Course:"+courseName);
        System.out.println("Code:"+courseCode);
        System.out.println("Student:"+enrolledStudent);
         System.out.println("Date:"+enrollmentDate);


 }
}

  public  class UniversityCourseReg{

   public static void main(String[]  args){

    Date d1=new Date(24,9,2025);
    
     Student S1=new Student("Waqar",143);

  Course Java = new Course("Java How to programme", "Cs201", S1, d1);

       Java.DisplayCourseInfo();


   } 
   }