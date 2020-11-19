package be.intecBrusselAudioPlayerAXELKAYILA;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String a) {
        System.out.println("Playing vlc file. Name: " + a);
    }

    @Override
    public void playMp4(String a) {

    }
}
