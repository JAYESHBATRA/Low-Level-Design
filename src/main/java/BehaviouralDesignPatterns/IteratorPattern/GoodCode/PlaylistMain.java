package BehaviouralDesignPatterns.IteratorPattern.GoodCode;

/**
 * Main Class: Demonstration
 */
public class PlaylistMain {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        
        myPlaylist.addSong(new Song("Bohemian Rhapsody", "Queen", "Rock"));
        myPlaylist.addSong(new Song("Stayin' Alive", "Bee Gees", "Disco"));
        myPlaylist.addSong(new Song("Hotel California", "Eagles", "Rock"));
        myPlaylist.addSong(new Song("Shape of You", "Ed Sheeran", "Pop"));

        System.out.println("--- Sequential Playing ---");
        SongIterator sequential = myPlaylist.createSequentialIterator();
        while (sequential.hasNext()) {
            System.out.println("Playing: " + sequential.next());
        }

        System.out.println("\n--- Shuffled Playing ---");
        SongIterator shuffled = myPlaylist.createShuffleIterator();
        while (shuffled.hasNext()) {
            System.out.println("Playing: " + shuffled.next());
        }

        /**
         * KEY BENEFIT:
         * Notice how the client (this Main class) doesn't know HOW the 
         * shuffling happens. It just asks for a ShuffleIterator and 
         * calls .next(). We could even add a GenreIterator tomorrow 
         * without changing any logic here!
         */
    }
}
