interface playable{
   
   double getDurationSeconds();
       default void play(){
                   System.out.println("Playing");
      }


} 