package filters;

import interfaces.ImageFilter;
import util.Logger;

public class SepiaFilter implements ImageFilter {
    public void apply(String image) {
        Logger logger = new Logger();
        logger.log("Se aplicó el filtro Sepia en la imagen: : " + image );
    }
}