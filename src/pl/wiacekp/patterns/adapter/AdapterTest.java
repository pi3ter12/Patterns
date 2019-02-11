package pl.wiacekp.patterns.adapter;

import pl.wiacekp.patterns.PatternTest;
import pl.wiacekp.patterns.adapter.player.AudioPlayer;

public class AdapterTest implements PatternTest.PatternTestInterface {
    @Override
    public void test() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

    @Override
    public String getTitle() {
        return "Adapter";
    }
}
