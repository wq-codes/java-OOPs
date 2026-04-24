class AdminStaff extends Employee{
  private String role;
 private  double overtime_Hours;
  
    public AdminStaff(String name,int age,int employeeID,double baseSalary,String role,double overtime_Hours) {
         super(name,age,employeeID,baseSalary);
          this.role=role;
          this.overtime_Hours = overtime_Hours;

    }
    public void setRole(String role){
        this.role=role;
    }
     public String   getRole(){
        return role;
     }
  public void setOvertime_Hours(double overtime_Hours){
                  this.overtime_Hours=overtime_Hours;
  }
  public double getOvertime_Hours(){
        return overtime_Hours;
  }

   public double  CalculateSalary(){
     return  getbaseSalary()+getOvertime_Hours()*500;
   
   }
@Override
public String toString(){
  return super.toString() + "\nRole:"+role+"\nOverTime Hours:"+overtime_Hours;
}
 
}


    