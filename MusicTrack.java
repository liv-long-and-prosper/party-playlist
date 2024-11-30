/**
 * MusicTrack class
 *
 * @author Liv Long
 * @version 11.28.24
 * */

package PartyPlaylist;

public class MusicTrack implements Comparable<MusicTrack> {

    //---------------------------------------------------------------
    //      INSTANCE DATA
    //---------------------------------------------------------------
    private String artist;
    private String songTitle;
    private int trackOrder;

    //---------------------------------------------------------------
    //      CONSTRUCTOR
    //---------------------------------------------------------------

    /**
     * MusicTrack Constructor
     *
     * @param artist    the artist's name
     * @param songTitle the title of the track
     * */
    public MusicTrack(String artist, String songTitle){
        setArtist(artist);
        setSongTitle(songTitle);
    }

    //---------------------------------------------------------------
    //      GET METHODS
    //---------------------------------------------------------------
    public String getArtist(){
        return artist;
    }

    public String getSongTitle(){
        return songTitle;
    }

    public int getTrackOrder(){
        return trackOrder;
    }

    //---------------------------------------------------------------
    //      SET METHODS
    //---------------------------------------------------------------

    /**
     * SetArtist sets the artist's name
     *
     * @param artist    the artist's name; must not be null or emtpy
     * @throws IllegalArgumentException     if artist is null or emtpy
     * */
    public void setArtist(String artist){
        if(artist == null || artist.isBlank()){
            throw new IllegalArgumentException("artist must not be null or empty, please provide a valid String");
        }
        this.artist = artist;
    }

    /**
     * SetSongTitle sets the title of the track
     *
     * @param songTitle    the title of the track; must not be null or emtpy
     * @throws IllegalArgumentException     if songTitle is null or emtpy
     * */
    public void setSongTitle(String songTitle){
        if (songTitle == null || songTitle.isBlank()){
            throw new IllegalArgumentException("songTitle must not be null or empty, please provide a valid String");
        }
        this.songTitle = songTitle;
    }

    /**
     * SetTrackOrder sets the placement of the song in a playlist
     *
     * @param trackOrder    the placement of the song in a playlist
     * @throws IllegalArgumentException     if trackOrder is less than or equal to zero
     * */
    public void setTrackOrder(int trackOrder){
        if (trackOrder <= 0){
            throw new IllegalArgumentException("trackOrder must be greater than 0, please provide a valid integer");
        }
        this.trackOrder = trackOrder;
    }

    //---------------------------------------------------------------
    //      OTHER METHODS
    //---------------------------------------------------------------
    public String toString(){
        return String.format("%d. %s -- %s\n",trackOrder,songTitle,artist);
    }

    /**
     * {@inheritDoc}
     * */
    @Override
    public int compareTo(MusicTrack other) {
        return Integer.compare(this.trackOrder,other.trackOrder);
    }
}