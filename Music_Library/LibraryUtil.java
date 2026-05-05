import java.util.ArrayList;
class LibraryUtil{
   
  static void playAll(ArrayList<Media> items){
             for(Media n:items){
                 if (n instanceof Song) {
                System.out.print("  - Song: ");
                n.play();
            } else if (n instanceof PodcastEp) {
                System.out.print("  - Podcast: ");
                n.play();
            }
}
  }

   static double totalDuration(ArrayList<Media> items){
       double sec=0;
       
       for(Media d: items){
             sec+=d.obtdurationSeconds();
           }
       return sec;

   }

    

    static ArrayList<Song> songsInGenre(ArrayList<Media> list, String genre) {
    
        ArrayList<Song> result = new ArrayList<>();
       for (Media m : list) {
          if (m instanceof Song) {
            Song s = (Song) m;
            if (s.getGenre().equalsIgnoreCase(genre)) {
                result.add(s);
            }
        }
    }
    return result;
}


     


}