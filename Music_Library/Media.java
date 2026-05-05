

abstract class Media implements playable, Comparable<Media> {

  private String title;
  private double durationSeconds;
  private  int releaseYear;
  private Artist artist;

    public Artist getArtist() {
        return artist;
    }

    public Media(String title, double durationSeconds, int releaseYear,Artist artist) {
           if(title==null){
            System.out.println("Invalid");
           }  else {
        this.title = title;
               }    this.durationSeconds = durationSeconds;
     
        if(releaseYear > 1877 && releaseYear<2100){
        this.releaseYear = releaseYear;
        }  else {
            System.out.println("Invalid");
        }

        this.artist = artist;
    }
  
  //getters
         
          
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
      int result= this.getTitle().compareToIgnoreCase(other.getTitle());

   if (result==0){
    if (this.getReleaseYear()> other.getReleaseYear())
        return 1; //mean swap it.....---> here other is older year so it should come first
 
        else if (this.getReleaseYear()<other.getReleaseYear())
               return -1;  //mean dont swap..  

             else 
               return 0;
      }         
             return result;
             }
        @Override
       public double getDurationSeconds(){
               return  obtdurationSeconds();
    }

      public  abstract void play();

@Override 
    public String toString(){
  return "Title:"+getTitle()+" Duration:"+obtdurationSeconds()+"  Release Year:"+getReleaseYear()+"  Artist:"+getArtist();


    }






  


}
