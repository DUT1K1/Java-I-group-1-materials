import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private List<Album> albums;
    private List<Music> musics;

    public Artist(String name, List<Album> albums) {
        this.name = name;
        this.albums = albums;
    }

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.musics = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", albums=" + albums +
                ", musics=" + musics +
                '}';
    }
}
