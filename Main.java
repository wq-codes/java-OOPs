public class Main{
  
   public static void main(String[] args){
    Battery B1=new Battery("5000MAh","li-ion");
           
      Battery B2=new Battery(B1);
        System.out.println(B2); 

       Phone P1=new Phone("Galaxy A06","Samsung",28000.00,B1);
         Phone P2=new Phone(P1);
        P2.battery.type="Aluminium";
        
  System.out.println(P2);  
      System.out.println("Total Mobile Phones Are:"+ Phone.count);  
}




}