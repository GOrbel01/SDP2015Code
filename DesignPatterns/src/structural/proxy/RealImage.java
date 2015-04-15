package structural.proxy;

/**
 * Created by Squall on 10/04/2015.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisc(fileName);
    }

    @Override
    public void display() {
        System.out.println("Display: " + fileName);
    }

    private void loadFromDisc(String fileName) {
        System.out.println("Loading: " + fileName);
    }
}
