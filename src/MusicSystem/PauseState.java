package MusicSystem;

public class PauseState implements  MusicState {
    @Override
    public void play(MusicPlayer musicPlayer)
    {
        System.out.println(" song is Playing");
        musicPlayer.setState(new PlayState());

    }
    @Override
    public void pause(MusicPlayer musicPlayer)
    {
        System.out.println(" song is already  Paused");

    }
    @Override
    public void stop(MusicPlayer musicPlayer)
    {
        System.out.println(" song is Stopped");
        musicPlayer.setState(new StopState());
    }

}
