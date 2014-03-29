package ua.kiev.javacourses;

import java.net.URL;

/**
 * Created by Oleg on 29.03.14.
 */
public class RealImage implements Image {
    public RealImage(URL url) {
        System.out.println("load up the image");
        loadImage(url);
    }

    @Override
    public void displayImage() {
        System.out.println("display the image");
    }

    // a method that only the real image has
    public void loadImage(URL url) {
        // do resource intensive operation to load image
        System.out.println("loading image");
    }
}
