public class Main{

  public static void main(String[] args) {
        //Creating two objects of Faculty
         Faculty ChemTec=new Faculty("Waqar", 18, 12345,30000, "Chemistry",5000.00);
            Faculty MathTec=new Faculty("Hanan", 45, 18745,50000, "Maths",10000.00);
   //Creating two objects for Admin Staff
       AdminStaff labStaff=new AdminStaff("Hamxa",23, 234, 25000, "Lab Attendant", 2.5);
      AdminStaff  AccouStaff=new AdminStaff("Ali",33, 9034, 44000, "Accounts Clerk",3.0);
//object for Employee Class
    Employee E1=new Employee("Adnan",64,12345,100000.00);
        // Calling Display Function
          System.out.println("========Employee Details=========");
          System.out.println(E1);

          System.out.println("Total Salary:"+E1.getbaseSalary());

          System.out.println("=========Faculty Details=========");
          System.out.println(MathTec);
          System.out.println("Total Salary:"+MathTec.CalculateSalary());
          
          System.out.println("=========Admin Staff Details=========");
          System.out.println(labStaff);
          System.out.println("Total Salary:"+labStaff.CalculateSalary());

  }

}