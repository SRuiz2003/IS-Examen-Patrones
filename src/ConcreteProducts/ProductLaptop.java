package ConcreteProducts;
import Interfaces.ProductFactory;


public class ProductLaptop implements ProductFactory.Product{
    private String brand;
    private String os;

    public ProductLaptop(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public String getDetails() {
        return "Laptop: Brand=" + brand + ", OS=" + os;
    }
}
