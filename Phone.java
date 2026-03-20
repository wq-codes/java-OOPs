

public class Phone{
static int count=0;
   String brand;
    String model;
    private  double price;
     Battery battery;
  

     //default Constructor
      Phone(){
      model="Unknown";
     price=0.00;
    brand="Coming soon";
      
        battery=new Battery();
    count++;
}    
//setter 
   void setprice(double price){
     if(price>0){
        this.price=price;          
     } else{
           System.out.println("Invalid price");
      
     }

   }

//getter
   double getprice(){

    return price;

   }




  //parameterized Constructor
Phone(String model,String brand,double price,Battery battery){
  this.model=model;
  
   this.brand=brand;
    this.battery=new Battery(battery);

     if(price>0){
        this.price=price;          
     } else{
           System.out.println("Invalid price");
      }    count++;
}
         
        //Deep copy Constructor
         Phone(Phone other){
           this.brand=other.brand;
            this.model=other.model;

        if(other.price>0){
           this.price=other.price;
        }  else {
            System.out.println("Invalid");
        }

           this.battery=new Battery(other.battery);          
           count++;
}      


  @Override
     public String toString(){
         return   "          Phone Information:"+"\nBrand:"+brand+"\nModel:"+model+"\nPrice:"+price+"\n"+battery;             


}

}