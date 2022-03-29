public class Song {
    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    @Override
    public boolean equals(Object compared) {
        boolean flag = false;
        if ((this == compared)) {
            flag = true;
        } else if (!(compared instanceof Song)) { 
            flag = false;
        } else {
            Song comparedSong = (Song) compared;
            
            flag = this.artist.equals(comparedSong.artist) &&
                   this.name.equals(comparedSong.name) &&
                   this.durationInSeconds == comparedSong.durationInSeconds;
        }
        
        return flag;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
}
