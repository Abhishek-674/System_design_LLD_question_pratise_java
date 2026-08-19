package MusicSystem;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    List<Songs> songs;
    String name;
    public Playlist(String name){
        this.name = name;
        songs = new ArrayList<Songs>();
    }
    void addSongToPlaylist(Songs song){
        songs.add(song);
    }
    void  removeSongFromPlaylist(Songs song){
        songs.remove(song);
    }

}
