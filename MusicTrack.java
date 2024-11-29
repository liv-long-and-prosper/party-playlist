/**
 * MusicTrack class
 *
 * @author Liv Long
 * @version 11.28.24
 * */

package PartyPlaylist;

import java.util.ArrayList;
import java.util.Collections;

public class MusicTrack implements Comparable<MusicTrack> {

    //---------------------------------------------------------------
    //      INSTANCE DATA
    //---------------------------------------------------------------
    private String artist;
    private String songTitle;
    private int trackOrder;

    //---------------------------------------------------------------
    //      CONSTRUCTORS
    //---------------------------------------------------------------
    public MusicTrack(String artist, String songTitle){
        setArtist(artist);
        setSongTitle(songTitle);
        setTrackOrder(1);
    }

    public MusicTrack(String artist, String songTitle, int trackOrder){
        setArtist(artist);
        setSongTitle(songTitle);
        setTrackOrder(trackOrder);
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
    public void setArtist(String artist){
        this.artist = artist;
    }

    public void setSongTitle(String songTitle){
        this.songTitle = songTitle;
    }

    public void setTrackOrder(int trackOrder){
        this.trackOrder = trackOrder;
    }

    //---------------------------------------------------------------
    //      STATIC METHODS
    //---------------------------------------------------------------

    //---------------------------------------------------------------
    //      OTHER METHODS
    //---------------------------------------------------------------
    public String toString(){
        return String.format("%d. %s -- %s\n",trackOrder,songTitle,artist);
    }

    @Override
    public int compareTo(MusicTrack other) {
        return Integer.compare(this.trackOrder,other.trackOrder);
    }
}