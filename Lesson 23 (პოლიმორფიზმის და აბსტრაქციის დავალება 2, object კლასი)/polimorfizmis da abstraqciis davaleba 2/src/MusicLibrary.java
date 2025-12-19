import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<Artist> artists;
    private List<Album> albums;
    private List<Music> musics;

    public MusicLibrary(List<Artist> artists, List<Album> albums, List<Music> musics) {
        this.artists = artists;
        this.albums = albums;
        this.musics = musics;
    }

    public MusicLibrary() {
        this.artists = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.musics = new ArrayList<>();
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public void addMusic(Music music) {
        musics.add(music);
    }

    public void removeMusic(Music music) {
        musics.remove(music);
    }

    public void addAlbum(Album album) {
        albums.add(album);
        musics.addAll(album.getMusics());
    }

    public void removeAlbum(Album album) {
        for (Music music : album.getMusics()) {
            musics.remove(music);
        }
        albums.remove(album);
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
        albums.addAll(artist.getAlbums());
        musics.addAll(artist.getMusics());
    }

    public Music searchMusic(String title) {
        for (Music music : musics) {
            if (music.getTitle().equals(title)) {
                return music;
            }
        }
        return null;
    }

    public Music getRandomMusic() {
        Random random = new Random();
        return musics.get(random.nextInt(musics.size()));
    }
}
