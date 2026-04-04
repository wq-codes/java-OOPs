  public class Faculty extends Employee{
     private String department;
     private double researchBonus;
          


      public void setDepartment(String department){
     this.department=department;

      }
   public String  getDepartment(){
      return department;
   }

   public void setBonus(int researchBonus){
      this.researchBonus=researchBonus;
   } 
   public double getBonus(){
     return researchBonus;
   }


      public Faculty(String name, int age, int employeeID, double baseSalary, String department, double researchBonus) {
    super(name, age, employeeID, baseSalary);  
    this.department = department;
    this.researchBonus = researchBonus;
      }

     public double CalculateSalary(){
             return getbaseSalary()+getBonus();

     }
  @Override
  public String toString(){
    return super.toString() + "\nDepartment:"+department+"\nResearch Bonus:"+researchBonus;

  }

}