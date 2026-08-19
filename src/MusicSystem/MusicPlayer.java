package MusicSystem;

public class MusicPlayer {
    MusicState currentState;
    int ind;
    Playlist  currentPlaylist;
    public MusicPlayer() {
        this.currentState=new StopState();

    }
    public void setCurrentPlaylist(Playlist playlist){
        this.currentPlaylist=playlist;
    }
    public void setState(MusicState state) {
        this.currentState=state;
    }

    public void nextSong(){
        if(ind==currentPlaylist.songs.size()-1){
            ind=0;
        }
        else
        {
            ind++;
        }
//        ind++;
        String temp=currentPlaylist.songs.get(ind).name;
        System.out.println("Next song is "+ temp);
    }
    public void previousSong(){
        if(ind==0){
            ind=currentPlaylist.songs.size()-1;
        }
        else {
            ind--;
        }

        System.out.println("Previous song is "+currentPlaylist.songs.get(ind));
    }

    void currentSong()
    {
        System.out.println("Current song is "+currentPlaylist.songs.get(ind));
    }
    void play()
    {
        currentState.play(this);
    }
    void pause()
    {
        currentState.pause(this);
    }
    void  stop()
    {
        currentState.stop(this);
    }
    void getSongs()
    {
        System.out.println(currentPlaylist.songs.get(ind).name);
    }
}
