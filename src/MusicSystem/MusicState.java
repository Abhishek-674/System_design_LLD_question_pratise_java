package MusicSystem;

public interface MusicState {
    void play(MusicPlayer musicPlayer);
    void pause(MusicPlayer musicPlayer);
    void stop(MusicPlayer musicPlayer);
}
