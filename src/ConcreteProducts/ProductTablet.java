package ConcreteProducts;
import Interfaces.ProductFactory;


public class ProductTablet implements ProductFactory.Product{
    private String brand;
    private String os;

    public ProductTablet(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public String getDetails() {
        return "Tablet: Brand=" + brand + ", OS=" + os;
    }
}
