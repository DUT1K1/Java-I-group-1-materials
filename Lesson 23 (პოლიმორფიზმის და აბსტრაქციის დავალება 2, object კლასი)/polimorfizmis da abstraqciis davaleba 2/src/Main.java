public class Main {
    public static void main(String[] args) {
        Album album = new Album("The Beatles", 1960);
        for (int i = 1; i <= 50; i++) {
            Music music = new Music(
                    "Title " + i,
                    100 + i,
                    "Genre " + i
            );
            album.addMusic(music);
        }
//        System.out.println(album);

        Artist artist = new Artist("The Beatles");
        artist.addAlbum(album);

//        System.out.println(artist.getAlbums());
//        System.out.println(artist.getMusics());


        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addArtist(artist);
    }
}
