package filters;

import interfaces.ImageFilter;
import util.Logger;

public class GrayScaleFilter implements ImageFilter {
    public void apply(String image) {
        Logger logger = new Logger();
        logger.log("Se aplicó el filtro de escala de grises en la imagen: " + image);
    }
}