package structural.adapter;

/**
 * Created by Squall on 10/04/2015.
 */
public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        //do nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
