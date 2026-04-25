

abstract class Media implements playable, Comparable<Media> {

  private String title;
  private double durationSeconds;
  private  int releaseYear;
  private Artist artist;

    public Artist getArtist() {
        return artist;
    }

    public Media(String title, double durationSeconds, int releaseYear, Artist artist) {
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
    
      if (this.getTitle().compareToIgnoreCase(other.getTitle())==0){

                return   this.getReleaseYear()-(other.getReleaseYear());
      } 

              else 
            return this.getTitle().compareToIgnoreCase(other.getTitle());
}
        @Override
       public double getDurationSeconds(){
               return  obtdurationSeconds();
    }

      public  abstract void play();


}
