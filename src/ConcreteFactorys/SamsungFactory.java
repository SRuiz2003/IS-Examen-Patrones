package ConcreteFactorys;
import ConcreteProducts.ProductLaptop;
import ConcreteProducts.ProductPhone;
import ConcreteProducts.ProductTablet;
import Interfaces.ProductFactory;


public class SamsungFactory implements ProductFactory {
    public ProductFactory.Product createProduct(String type) {
        switch (type) {
            case "mobile":
                return new ProductPhone("Samsung", "Android");
            case "tablet":
                return new ProductTablet("Samsung", "Android");
            case "laptop":
                return new ProductLaptop("Samsung", "Windows");
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}