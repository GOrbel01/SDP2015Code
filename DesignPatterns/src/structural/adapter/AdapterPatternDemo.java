package structural.adapter;

/**
 * Created by Squall on 10/04/2015.
 *   Adapter pattern works as a bridg e between two incompatible interfaces. This type of design pattern comes
     under structural pattern as this pattern combines the capability of two independent interfaces.
     This pattern involves a sing le class which is responsible to join functionalities of independent or incompatible
     interfaces. A real life example could be a case of card reader which acts as an adapter between memory card
     and a laptop. You plug ins the memory card into card reader and card reader into the laptop so that memory card
     can be read via laptop.
     We are demonstrating use of Adapter pattern via following example in which an audio player device can play mp3
     files only and wants to use an advanced audio player capable of playing vlc and mp4 files.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Plug In Baby.mp3");
        audioPlayer.play("mp4", "American Dad.mp4");
        audioPlayer.play("vlc", "Finding Nemo.vlc");
        audioPlayer.play("avi", "Game of Thrones.avi");
    }
}
