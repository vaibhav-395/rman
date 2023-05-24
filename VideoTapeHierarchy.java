class VideoTape {
    private String title;
    private int duration;

    public VideoTape(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void play() {
        System.out.println("Playing video: " + title);
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class Movie extends VideoTape {
    private String director;

    public Movie(String title, int duration, String director) {
        super(title, duration);
        this.director = director;
    }

    public void play() {
        System.out.println("Playing movie: " + getTitle());
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Director: " + director);
    }
}

class MusicVideo extends VideoTape {
    private String artist;

    public MusicVideo(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing music video: " + getTitle());
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Artist: " + artist);
    }
}

public class VideoTapeHierarchy {
    public static void main(String[] args) {
        VideoTape videoTape = new VideoTape("Generic Video", 90);
        videoTape.play();
        videoTape.displayInfo();
        System.out.println();

        Movie movie = new Movie("The Matrix", 150, "Lana Wachowski");
        movie.play();
        movie.displayInfo();
        System.out.println();

        MusicVideo musicVideo = new MusicVideo("Bohemian Rhapsody", 6, "Queen");
        musicVideo.play();
        musicVideo.displayInfo();
    }
}
