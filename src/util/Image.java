package util;

import interfaces.ImageFilter;

public class Image {
    private ImageFilter filter;

    public void setFilter(ImageFilter filter) {
        this.filter = filter;
    }

    public void processImage(String image) {
        filter.apply(image);
    }
}