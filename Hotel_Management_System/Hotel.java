import java.util.ArrayList;
class Hotel {

   ArrayList<Room> rooms;

    public Hotel(ArrayList<Room> rooms) {
        this.rooms = new ArrayList<>();
    }

   public void  addRoom (Room r){
           if (r!=null){
            rooms.add(r);
           }
          else 
          System.out.println("Empty");
   }
  public void showAvailableRooms(){

         for(Room r:rooms){
            if (r.getstatus().equals("Available")){
               System.out.println(r);
            }
         }
 }
       public void findRoomBynum(int num){
            for(Room r:rooms){
                if(r.getRoomNo()==num)
                       System.out.println(r);

       }








}