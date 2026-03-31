class Person {
protected String name;
protected int age;
protected int id;

    public Person() {
    }

   public Person(String name,int age,int id){
     this.name=name;
     this.id=id;
     this.age=age;
   }
   public void Display(){
     System.out.println("Name:"+name+"\nAge:"+age+"\nID:"+id);
   }

}
  class Student extends Person{
   String Program;
   String Semester;

    public Student() {
    }
   
  
  public Student(String name,int age,int id,String Program,String Semester){

    super(name, age, id);
     this.Program=Program;
     this.Semester=Semester;
  }
  public void DisplayStudentInfo(){

   super.Display();
   System.out.println("Program:"+Program+"\nSemester:"+Semester);

  }


  }
     class Teacher extends Person{

    String Subject;
    double Salary;

    public Teacher() {
    }

    public Teacher(String name,int age,int id,String Subject,double Salary){
  super(name, age, id);
   this.Subject=Subject;
   this.Salary=Salary;
    }

  
   public void DisplayTeacherInfo(){
      super.Display();
      System.out.println("Subject:"+Subject+"\nSalary:"+Salary);
   }

     }

  public class Inheritence{

   public static void main(String[] args){
         
         System.out.println("===========STudent===========");
             Student Alex=new Student("Tom",24,4356,"Software Engineering","2nd");
                Alex.DisplayStudentInfo();

                System.out.println("==========Teacher===========");

     Teacher T1= new Teacher("John",34,2345,"Chemistry",45000.00);
         T1.DisplayTeacherInfo();

   }





  }