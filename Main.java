package PartyPlaylist;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){

        // Adding my top 5 songs to an ArrayList
        ArrayList<MusicTrack> myTopFive = new ArrayList<>(5);
        myTopFive.add(new MusicTrack("Nolan Taylor", "68"));
        myTopFive.add(new MusicTrack("John + Jane Q", "Watermelon"));
        myTopFive.add(new MusicTrack("Glass Animals","Agnes"));
        myTopFive.add(new MusicTrack("Lin-Manuel Miranda;Hamilton","My Shot"));
        myTopFive.add(new MusicTrack("Zach Bryan","Fear and Friday's(Poem)"));

        ArrayList<MusicTrack> partyVibes = new ArrayList<>(6);
        partyVibes.add(new MusicTrack("Penelope Scott","Rät"));
        partyVibes.add(new MusicTrack("IC3PEAK,ZillaKami","TRRST"));
        partyVibes.add(new MusicTrack("Hollywood Undead","Everywhere I Go"));
        partyVibes.add(new MusicTrack("Levity","Britney Spears - Toxic(Levity Remix)"));
        partyVibes.add(new MusicTrack("Kali Uchis","telepatîa"));
        partyVibes.add(new MusicTrack("Santana,Rob Thomas","Smooth"));
        partyVibes.remove(1);

        ArrayList<MusicTrack> finalPartyPlaylist = new ArrayList<>();
        finalPartyPlaylist.addAll(myTopFive);
        finalPartyPlaylist.addAll(partyVibes);

        Iterator<MusicTrack> musicTrackIterator = finalPartyPlaylist.iterator();
        while (musicTrackIterator.hasNext()){
            MusicTrack currentTrack = musicTrackIterator.next();
            currentTrack.setTrackOrder(generateRandomNum());
        }
        Collections.sort(finalPartyPlaylist);

        System.out.print("\n\n--------------\n");
        System.out.print("Party Playlist\n");
        System.out.print("--------------\n");
        int order = 1;
        for(MusicTrack track : finalPartyPlaylist){
            track.setTrackOrder(order);
            System.out.println(track);
            order++;
        }
    }

//    private static void sortByArtist(ArrayList<MusicTrack> playlist){
//
//    }
//    private static void sortBySong(ArrayList<MusicTrack> playlist){
//
//    }

//    private static void sortByTrackOrder(Iterator<MusicTrack> musicTrackIterator){
//        int order = 1;
//        while (musicTrackIterator.hasNext()){
//            MusicTrack currentTrack = musicTrackIterator.next();
//            currentTrack.setTrackOrder(order);
//            order++;
//        }
//    }

    private static int generateRandomNum(){
        int randomNum = (int) Math.floor(Math.random() * 100+1);
        return randomNum;
    }
}