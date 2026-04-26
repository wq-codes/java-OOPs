class Artist {

   private String Name;
   private String country;
   private  long followerCount;

    public Artist(String Name, String country) {
        this.Name = Name;
        this.country = country;
        this.followerCount = 0;

    }


    public void addfollowers(long delta){

           this.followerCount+=delta;


    }

    public long getFollowerCount() {
        return  followerCount;
    }
    

    public String getName() {
        return Name;
    }

    

    public String getCountry() {
        return country;
    }


   @Override
   public boolean equals(Object obj){
     if (this==obj)
         return true;
      if (obj instanceof Artist){
        Artist other= (Artist) obj;

    
     if ( this.getName().compareToIgnoreCase(other.getName())==0){
         return true;
     }       }
  return false;
   }

    @Override
    public String toString() {
        return  "Name:"+getName()+"\nCountry:"+getCountry()+"\nfollower Count:"+getFollowerCount();
    }
     
    

}
