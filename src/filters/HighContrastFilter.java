package filters;

import interfaces.ImageFilter;
import util.Logger;

public class HighContrastFilter implements ImageFilter {
    public void apply(String image) {
        Logger logger = new Logger();
        logger.log("Se aplicó el filtro de Alto contraste en la imagen: : " + image);
    }
}