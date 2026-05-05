import java.util.ArrayList;
import java.util.Collections;

public class Tester {

    public static void main(String[] args) {

        // 9.1 - Creating Objects
        System.out.println("============= 9.1 Creating Objects =============");

        Artist A1 = new Artist("Atif Aslam", "Pakistan");
        Artist A2 = new Artist("Cheema Y", "India");
        Artist A3 = new Artist("Bilal Saeed", "Pakistan");
        A1.addfollowers(23032000);
        A2.addfollowers(7300000);
        A3.addfollowers(1340000);

        Song S1 = new Song("Meri Zindagi hai tu", 545, 2025, A1, "Romantic");
        Song S2 = new Song("Dil Lagi", 400, 2019, A2, "Sad");
        Song S3 = new Song("The End of Beginning", 230, 2018, A3, "Emotional");
        Song S4 = new Song("Tera Hona", 198, 2022, A1, "Romantic");

        PodcastEp P1 = new PodcastEp("Podcast No. 1: Introduction to Python", 3235, 2021, A1, "Podcast", 3);
        PodcastEp P2 = new PodcastEp("Tech Talk: Future of CyberSecurity", 270, 2023, A2, "Tech Talk", 7);

        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);

        // 9.2 - Heterogeneous ArrayList
        System.out.println("\n============= 9.2 Heterogeneous ArrayList =============");

        ArrayList<Media> list = new ArrayList<>();
        list.add(S1);
        list.add(S2);
        list.add(S3);
        list.add(S4);
        list.add(P1);
        list.add(P2);

        for (Media m : list) {
            System.out.println(m);
        }

        // 9.3 - Polymorphic play() via LibraryUtils.playAll
        System.out.println("\n============= 9.3 Polymorphic play() =============");
        LibraryUtil.playAll(list);

        // 9.4 - Natural sort
        System.out.println("\n============= 9.4 Natural Sort (Title then Year) =============");
        Collections.sort(list);
        for (Media m : list) {
            System.out.println(m.getTitle() + " | " + m.getReleaseYear());
        }

        // 9.5 - Comparator sorts
        System.out.println("\n============= 9.5a Sort by Duration (Ascending) =============");
        Collections.sort(list, new sortbyDuration());
        for (Media m : list) {
            int mins = (int) m.getDurationSeconds() / 60;
            int secs = (int) m.getDurationSeconds() % 60;
            System.out.println(m.getTitle() + " | " + mins + ":" + secs);
        }

        System.out.println("\n============= 9.5b Sort by Release Year (Descending) =============");
        Collections.sort(list, new sortByreleaseYear());
        for (Media m : list) {
            System.out.println(m.getTitle() + " | " + m.getReleaseYear());
        }

        // 9.6 - equals scenarios
        System.out.println("\n============= 9.6 equals() Scenarios =============");

        System.out.println("Case 1 - Same object:");
        System.out.println("Result: " + A1.equals(A1));

        Artist A1copy = new Artist("Atif Aslam", "Pakistan");
        System.out.println("\nCase 2 - Same name different followers:");
        System.out.println("Result: " + A1.equals(A1copy));

        System.out.println("\nCase 3 - Different name:");
        System.out.println("Result: " + A1.equals(A2));

        System.out.println("\nCase 4 - Null check:");
        System.out.println("Result: " + A1.equals(null));

        Song Sduplicate = new Song("Dil Lagi", 400, 2019, A2, "Sad");
        System.out.println("\nCase 5 - Two separate Song objects same data:");
        System.out.println("Result: " + S2.equals(Sduplicate));

        // 9.7 - LibraryUtils methods
        System.out.println("\n============= 9.7 LibraryUtils Methods =============");

        double totalSec = LibraryUtil.totalDuration(list);
        int tMins = (int) totalSec / 60;
        int tSecs = (int) totalSec % 60;
        System.out.println("totalDuration: " + tMins + ":" + tSecs + " (mm:ss)");

        System.out.println("\nsongsInGenre - Romantic:");
        ArrayList<Song> romanticSongs = LibraryUtil.songsInGenre(list, "Romantic");
        for (Song s : romanticSongs) {
            System.out.println("  - " + s.getTitle());
        }

        System.out.println("\nplayAll:");
        LibraryUtil.playAll(list);

        // Playlist
        Playlist favSongs = new Playlist("Favorite Songs", null);
        favSongs.addItems(S1);
        favSongs.addItems(S2);
        favSongs.addItems(S4);

        Playlist sadPlaylist = new Playlist("Sad Songs", null);
        sadPlaylist.addItems(S2);
        sadPlaylist.addItems(P1);

        System.out.println("\n" + favSongs);
        System.out.println(sadPlaylist);

        // 9.8 - Total duration
        System.out.println("\n============= 9.8 Total Library Duration =============");
        System.out.println("Total items: " + list.size());
        System.out.println("Total duration: " + tMins + ":" + tSecs + " (mm:ss)");
    }
}
