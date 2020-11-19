package be.intecBrusselAudioPlayerAXELKAYILA;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String a) {

    }

    @Override
    public void playMp4(String a) {
        System.out.println("Playing vlc file. Name: " + a);

    }
}
