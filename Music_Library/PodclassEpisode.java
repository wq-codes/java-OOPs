class PodcastEpisode extends Media{

    private String name;
    private int epNo;

    public int getEpNo() {
        return epNo;
    }

    public String getName() {
        return name;
    }
      

    public PodcastEpisode( String title, double durationSeconds, int releaseYear, Artist artist,String name, int epNo) {
        super(title, durationSeconds, releaseYear, artist);
        this.name = name;
        this.epNo = epNo;
       }

@Override
  public void play(){
    System.out.println("Playing podcast:"+getName()+" Episode No:"+getEpNo()+" "+getTitle());



  }
     


}