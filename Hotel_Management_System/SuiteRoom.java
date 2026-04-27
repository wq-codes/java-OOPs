class SuiteRoom extends Room{

   int maxGuests;
   static int count=0;

    public SuiteRoom(int maxGuests, int roomNo, int floorNum, double priceperNight, String guestName, int nightsStayed) {
        super(roomNo, floorNum, priceperNight, guestName, nightsStayed);
        this.maxGuests = maxGuests;
               count++;
    }

@Override
 public String getRoomType(){
      return "Suite";
 }
     @Override
     public void checkin(String name){
        System.out.println(getGuestName()+"! Welcome to Serina");
     }
    

}