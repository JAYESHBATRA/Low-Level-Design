package BehaviouralDesignPatterns.IteratorPattern.BadCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Data Model: Song (Simplified for Bad Code)
 */
class BadSong {
    private String title;
    public BadSong(String title) { this.title = title; }
    public String getTitle() { return title; }
}

/**
 * VIOLATION: Exposing internal storage.
 */
class BadPlaylist {
    private List<BadSong> songs = new ArrayList<>();
    public void addSong(BadSong song) { songs.add(song); }
    
    // Violation: Exposing the internal list
    public List<BadSong> getSongs() { return songs; }
}

public class BadPlaylistMain {
    public static void main(String[] args) {
        BadPlaylist playlist = new BadPlaylist();
        playlist.addSong(new BadSong("Song A"));
        playlist.addSong(new BadSong("Song B"));
        playlist.addSong(new BadSong("Song C"));

        System.out.println("--- Bad Playlist: Client-Side Shuffling ---");
        
        // Client wants to shuffle
        List<BadSong> songs = new ArrayList<>(playlist.getSongs());
        Collections.shuffle(songs);
        
        for (BadSong song : songs) {
            System.out.println("Playing: " + song.getTitle());
        }

        /**
         * PROBLEM:
         * 1. The client has to know 'Collections.shuffle' and how to copy the list.
         * 2. If the playlist changes to an Array[] or a Set, the client code 
         *    responsible for shuffling will BREAK.
         * 3. Business logic (how to shuffle or filter) is leaked into the client.
         */
    }
}
