package MusicSystem;

public class StopState implements MusicState {
    @Override
    public void play(MusicPlayer musicPlayer)
    {
        System.out.println(" song is Playing");
        musicPlayer.setState(new PlayState());
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
        System.out.println(" song is already Stopped");
    }
}
