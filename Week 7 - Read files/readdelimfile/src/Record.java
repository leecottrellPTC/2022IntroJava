import java.util.Objects;

public class Record {
    private String title;
    private String artist;
    private int year;

    public Record() {
    }

    public Record(String title,String artist,int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Record title(String title) {
        setTitle(title);
        return this;
    }

    public Record artist(String artist) {
        setArtist(artist);
        return this;
    }

    public Record year(int year) {
        setYear(year);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Record)) {
            return false;
        }
        Record record = (Record) o;
        return Objects.equals(title,record.title) && Objects.equals(artist,record.artist) && year == record.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,artist,year);
    }

    @Override
    public String toString() {
        return title + " recorded by " + artist + " in " + year;
    }


}
