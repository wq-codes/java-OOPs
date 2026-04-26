

abstract class Media implements playable, Comparable<Media> {

  private String title;
  private double durationSeconds;
  private  int releaseYear;
  private Artist artist;

    public Artist getArtist() {
        return artist;
    }

    public Media(String title, double durationSeconds, int releaseYear) {
        this.title = title;
        this.durationSeconds = durationSeconds;
        this.releaseYear = releaseYear;
        this.artist = artist;
    }
  
  //getters
          public Artist getArtist(){
              return artist;
          }
    public double obtdurationSeconds() {
        return durationSeconds;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getTitle() {
        return title;
    }

    
       @Override 
       public int compareTo(Media other){
      int result= this.gettitle().comparetoignorecase(other.gettitle())

   if (result==0){
    if (this.getReleaseyear()> other.getReleaseyear()){
        return 1 //mean swap it.....---> here other is older year so it should come first
  } 
         if (this.getReleaseyear()<other.getReleaseyear()){
               return -1;  //mean dont swap..  
}
              if (this.getReleaseyear()==other.getReleaseyear()){
               return 0;
}           else  
             return result;
}
}
        @Override
       public double getDurationSeconds(){
               return  obtdurationSeconds();
    }

      public  abstract void play();

@Override 
    public String toString(){
  return "Title:"+getTitle()+" Duration:"+obtdurationSeconds()+"  Release Year:"+getReleaseyear()+"  Artist:"+getArtist();


    }






  


}
