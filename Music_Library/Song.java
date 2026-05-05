class Song extends Media{

  private String genre;

    public Song( String title, double durationSeconds, int releaseYear, Artist artist,String genre) {
        super(title, durationSeconds, releaseYear, artist);
        this.genre = genre;
    }


     @Override
     public void play(){

        System.out.println("Playing Song: "+getTitle()+" By:"+getArtist().getName() +"  Type:"+getGenre());

     }

    public String getGenre() {
        return genre;
    }
           public boolean equals(Object obj){
               if(this==obj)
                return true;
          
          if(!(obj instanceof Song))
                return false;

   else {
     Song other= (Song) obj;
       return this.getGenre().equals(other.getGenre());
   }
          
               


           }
   

}