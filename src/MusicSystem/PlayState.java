package MusicSystem;

public class PlayState implements MusicState {
    @Override
    public void play(MusicPlayer musicPlayer)
    {
        System.out.println("Song is already Playing");

    }
    @Override
    public void pause(MusicPlayer musicPlayer)
    {
        System.out.println(" song is Paused");
        musicPlayer.setState(new PauseState());

    }
    @Override
    public void stop(MusicPlayer musicPlayer)
    {
        System.out.println(" Song is Stopped");
        musicPlayer.setState(new StopState());

    }
}

