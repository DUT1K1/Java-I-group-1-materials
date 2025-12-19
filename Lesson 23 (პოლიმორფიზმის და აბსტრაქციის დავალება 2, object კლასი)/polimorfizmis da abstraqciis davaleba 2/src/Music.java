public class Music extends Playable{
    private String title;
    private double duration;
    private String genre;

    public Music(String title, double duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void start() {
        System.out.println("Playing " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopping " + title);
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                "}";
    }
}
