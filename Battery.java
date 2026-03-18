public class Battery{

    String  capacity;
   String type;
    
   //default constructor
  Battery(){
   capacity = "Unknown";
    type = "Unknown";
}
   //Parameterized Constructor
   Battery(String capacity,String type){

   this.capacity=capacity;
     this.type=type;

}
   //deep copy constructor
   Battery(Battery other){
   this.capacity=other.capacity;
   this.type=other.type;
    
}
   //toString()Method
   
    @Override
  public String toString(){
    return  "BatteryInfo"+"\nCapacity:"+capacity+"\nType:"+type;
         
}  

}