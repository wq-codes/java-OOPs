abstract class Room   implements Bookable, Serviceable {

   private int roomNo;
   private int floorNum;
   private double priceperNight;
   private String guestName;
   private double nightsStayed;
   private  double totalbill;
    //Constructor
          Room(int roomNo, int floorNum, double priceperNight, String guestName, int nightsStayed) {
        this.roomNo = roomNo;
        this.floorNum = floorNum;
        this.priceperNight = priceperNight;
        this.guestName = guestName;
        this.nightsStayed = nightsStayed;
        this.totalbill=0;
    }





    public void setTotalbill(double totalbill) {
        this.totalbill = totalbill;
    }

    public double getTotalbill() {
        return totalbill;
    }
      
      

   // getters and Setters
    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }
       

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
       
    public double getNightsStayed() {
        return nightsStayed;
    }  

    public void setNightsStayed(int nightsStayed) {
        this.nightsStayed = nightsStayed;
    }
       

    public double getPriceperNight() {
        return priceperNight;
    }

    public void setPriceperNight(double priceperNight) {
        this.priceperNight = priceperNight;
    }
        

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

        
    abstract  String getRoomType();
   
   //toString
   public String toString(){

   return "Room No:"+getRoomNo()+"\nFloor No:"+getFloorNum()+"\nGuest Name:"+getGuestName()+"\nPrice Per Night:"+getPriceperNight()+"\nNight Stayed:"+getNightsStayed();

     }

      
      public String getStatus(){
           if (getGuestName()==null){
              return "Available";
           }
          else 
           return "Occupied";
      } 

      public void checkout(){
         totalbill=priceperNight*nightsStayed;
    
      }
 
}