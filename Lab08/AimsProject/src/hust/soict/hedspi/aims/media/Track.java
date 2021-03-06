package hust.soict.hedspi.aims.media;

public class Track implements Playable, Comparable {
    private String title;
    private int length;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public Track(String title){
        this.title = title;
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Track) {
            Track track = (Track) obj;
            return (track.length == this.length && track.title.equals(this.title));
        }
        return false;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    
}
