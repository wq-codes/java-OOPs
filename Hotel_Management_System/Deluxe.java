class Deluxe extends Room{

 boolean hasSeaview=false;

    public Deluxe(boolean hasSeaview, int roomNo, int floorNum, double priceperNight, String guestName, int nightsStayed) {
        super(roomNo, floorNum, priceperNight, guestName, nightsStayed);
        this.hasSeaview = hasSeaview;
    }

     

 public String getRoomtype(){

   return "Deluxe";
 }
    @Override
    public void checkout(){
   if (hasSeaview==true){
      System.out.println("Total Price HAD SEA VIEW:"+((getPriceperNight()) + 2000) * getNightsStayed());
   
 }
  else {
         System.out.println("No sea view Available");
    }
 }





}