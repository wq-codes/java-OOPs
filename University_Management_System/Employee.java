public class Employee extends person{
  private  int employeeID;
  private  double baseSalary;

      public void setID(int employeeID){
    this.employeeID=employeeID;
   
      }
  public int getID(){
    return employeeID;
  }
  public void setbaseSalary(){
       this.baseSalary=baseSalary;

  }
  public double getbaseSalary(){
       return baseSalary;
  }
  
  
  public Employee(String name,int age,int employeeID,double baseSalary){
       super(name,age);
      this.employeeID=employeeID;
      this.baseSalary=baseSalary;
      
  }
@Override
public  String toString(){
    return super.toString() + "\nEmployeeID:"+employeeID+"\nBase Salary:"+baseSalary;

}


}