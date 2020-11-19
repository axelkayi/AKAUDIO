package be.intecBrusselAudioPlayerAXELKAYILA;

public class AudioPlayer implements MediaPlayer{
    private String mediaAdapter;
    private String MediaAdapter;
    private MediaPlayer a;


    @Override
    public void play(String audioType, String Filename) {
        if(audioType == "mp3"){
            System.out.println("this is a mp3");
        }
        this.mediaAdapter = Filename;
    }
}
