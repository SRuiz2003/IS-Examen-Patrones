package ConcreteProducts;
import Interfaces.ProductFactory;


public class ProductPhone implements ProductFactory.Product{
    private String brand;
    private String os;

    public ProductPhone(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public String getDetails() {
        return "Mobile Phone: Brand=" + brand + ", OS=" + os;
    }
}
