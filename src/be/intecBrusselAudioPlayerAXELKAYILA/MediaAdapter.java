package be.intecBrusselAudioPlayerAXELKAYILA;

public class MediaAdapter implements MediaPlayer {
    private String advancedMusicPlayer;
    private String advancedMediaPlayer;
    private AdvancedMediaPlayer a;

    public MediaAdapter(String audioType){
        this.advancedMediaPlayer = audioType;
    }

    public MediaAdapter(String advancedMusicPlayer, String advancedMediaPlayer){
        this.advancedMediaPlayer = advancedMediaPlayer;
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    @Override
    public void play(String a, String b) {


    }
}
