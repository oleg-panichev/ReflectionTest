package ua.kiev.javacourses;

import java.net.URL;

/**
 * Created by Oleg on 29.03.14.
 */
public class ProxyImage implements Image {
    private URL url;

    public ProxyImage(URL url) {
        this.url=url;
    }

    // this method delegates to the real image
    @Override
    public void displayImage() {

    }
}
