package PartyPlaylist;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){

        // Adding my top 5 songs to an ArrayList called myTopFive
        ArrayList<MusicTrack> myTopFive = new ArrayList<>(5);
        myTopFive.add(new MusicTrack("Nolan Taylor", "68"));
        myTopFive.add(new MusicTrack("John + Jane Q", "Watermelon"));
        myTopFive.add(new MusicTrack("Glass Animals","Agnes"));
        myTopFive.add(new MusicTrack("Lin-Manuel Miranda;Hamilton","My Shot"));
        myTopFive.add(new MusicTrack("Zach Bryan","Fear and Friday's(Poem)"));

        // Adding songs that I think my friends might like to an ArrayList called partyVibes
        ArrayList<MusicTrack> partyVibes = new ArrayList<>(6);
        partyVibes.add(new MusicTrack("Penelope Scott","Rät"));
        partyVibes.add(new MusicTrack("IC3PEAK,ZillaKami","TRRST"));
        partyVibes.add(new MusicTrack("Hollywood Undead","Everywhere I Go"));
        partyVibes.add(new MusicTrack("Levity","Britney Spears - Toxic(Levity Remix)"));
        partyVibes.add(new MusicTrack("Kali Uchis","telepatîa"));
        partyVibes.add(new MusicTrack("Santana,Rob Thomas","Smooth"));
        partyVibes.remove(1);

        // Merging myTopFive and partyVibes
        ArrayList<MusicTrack> finalPartyPlaylist = new ArrayList<>();
        finalPartyPlaylist.addAll(myTopFive);
        finalPartyPlaylist.addAll(partyVibes);

        // Shuffling songs in finalPartyPlaylist and printing
        setTrackOrder(finalPartyPlaylist);
        System.out.print("\n\n--------------\n");
        System.out.print("Party Playlist\n");
        System.out.print("--------------\n\n");
        for (MusicTrack track : finalPartyPlaylist){
            System.out.println(track);
        }
    }

    /**
     * GenerateRandomNum generates a random number between 0 and 100
     *
     * @return randomNum
     * */
    private static int generateRandomNum(){
        int randomNum = (int) Math.floor(Math.random() * 100+1);
        return randomNum;
    }

    /**
     * SetTrackOrder takes a given ArrayList of MusicTrack objs and shuffles the tracks
     *
     * @param playlist      the ArrayList of MusicTrack objs
     * @return              the shuffled ArrayList with trackOrder ascending from first to last track
     * */
    private static ArrayList<MusicTrack> setTrackOrder(ArrayList<MusicTrack> playlist){
        if (playlist == null || playlist.size() == 0){
            throw new IllegalArgumentException("playlist must not be null or empty, please provide a valid ArrayList<MusicTrack>");
        }
        // Create an Iterator to loop through playlist and setTrackOrder to a random int between 0 & 100
        Iterator<MusicTrack> musicTrackIterator = playlist.iterator();
        while (musicTrackIterator.hasNext()){
            MusicTrack currentTrack = musicTrackIterator.next();
            currentTrack.setTrackOrder(generateRandomNum());
        }

        // Sort playlist
        Collections.sort(playlist);

        // Use an index-based for-loop to set the track order in ascending order from first to last
       int order = 1;
        for(int i = 0; i < playlist.size(); i++){
            MusicTrack track = playlist.get(i);
            track.setTrackOrder(order);
            order++;
        }
        return playlist;
    }
}