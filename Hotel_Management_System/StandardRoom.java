
class StandardRoom extends Room {


public StandardRoom( int roomNo, int floorNum, double priceperNight, String guestName, int nightsStayed) {
        super(roomNo, floorNum, priceperNight, guestName, nightsStayed);
        
    }
     @Override
      public String getRoomType(){
  return "Standard";
      } 
   
}