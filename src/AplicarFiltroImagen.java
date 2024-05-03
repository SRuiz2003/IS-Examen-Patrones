import filters.GrayScaleFilter;
import filters.HighContrastFilter;
import filters.SepiaFilter;
import util.Image;
import util.Logger;

import java.util.Scanner;

public class AplicarFiltroImagen {
    public static void main(String[] args) {
        Image processor = new Image();
        Scanner scanner = new Scanner(System.in);

        Logger logger = new Logger();

        logger.log("Escriba el nombre del filtro a aplicar:");
        logger.log("Alto contraste");
        logger.log("Grises");
        logger.log("Sepia");

        String choice = scanner.next();
        logger.log("Escriba el nombre de la imagen:");
        String imageName = scanner.next();

        switch (choice) {
            case "Alto contraste":
                processor.setFilter(new HighContrastFilter());
                break;
            case "Grises":
                processor.setFilter(new GrayScaleFilter());
                break;
            case "Sepia":
                processor.setFilter(new SepiaFilter());
                break;
            default:
                logger.log("Por favor elija una de las opciones");
                return;
        }

        processor.processImage(imageName);
    }
}