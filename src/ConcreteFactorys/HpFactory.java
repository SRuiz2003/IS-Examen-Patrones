package ConcreteFactorys;
import ConcreteProducts.ProductLaptop;
import ConcreteProducts.ProductPhone;
import ConcreteProducts.ProductTablet;
import Interfaces.ProductFactory;


public class HpFactory implements ProductFactory {
    public ProductFactory.Product createProduct(String type) {
        switch (type) {
            case "mobile":
                return new ProductPhone("HP", "Android");
            case "tablet":
                return new ProductTablet("HP", "Android");
            case "laptop":
                return new ProductLaptop("HP", "Windows");
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}