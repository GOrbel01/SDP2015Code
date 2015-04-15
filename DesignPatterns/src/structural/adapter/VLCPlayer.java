package structural.adapter;

/**
 * Created by Squall on 10/04/2015.
 */
public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
