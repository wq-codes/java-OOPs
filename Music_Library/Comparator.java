import java.util.Comparator;
class sortbyDuration implements Comparator<Media>{

   @Override
   public int Compare(Media m1,Media m2){
      return Double.compare (m1.getDurationSeconds(),m2.getDurationSeconds());     

   }
}

   class sortByreleaseYear implements Comparator<Media> {

    @Override
    public int compare(Media m1, Media m2) {

        if (m1.getReleaseYear() < m2.getReleaseYear())
            return 1;
        if (m1.getReleaseYear() > m2.getReleaseYear())
            return -1;
        return 0;

    }


}