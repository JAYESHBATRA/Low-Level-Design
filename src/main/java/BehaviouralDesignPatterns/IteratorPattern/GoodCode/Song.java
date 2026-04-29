package BehaviouralDesignPatterns.IteratorPattern.GoodCode;

/**
 * Data Model: Song
 */
class Song {
    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getGenre() { return genre; }

    @Override
    public String toString() {
        return String.format("[%s] %s by %s", genre.toUpperCase(), title, artist);
    }
}
