package MusicSystem;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        Songs s1=new Songs("abc");
        Songs s2=new Songs("def");
        Songs s3=new Songs("ghi");
        Songs s4=new Songs("jkl");
        Songs s5=new Songs("mno");
        Songs s6=new Songs("pqr");
        Playlist p1=new Playlist("best songs");
        p1.addSongToPlaylist(s1);
        p1.addSongToPlaylist(s2);
        p1.addSongToPlaylist(s3);
        p1.addSongToPlaylist(s4);
        p1.addSongToPlaylist(s5);
        p1.addSongToPlaylist(s6);
        musicPlayer.setCurrentPlaylist(p1);
        musicPlayer.getSongs();
        musicPlayer.play();
        musicPlayer.nextSong();
        musicPlayer.getSongs();
    }
}
