package ConcreteFactorys;
import ConcreteProducts.ProductLaptop;
import ConcreteProducts.ProductPhone;
import ConcreteProducts.ProductTablet;
import Interfaces.ProductFactory;


public class AppleFactory implements ProductFactory {
    public ProductFactory.Product createProduct(String type) {
        switch (type) {
            case "mobile":
                return new ProductPhone("Apple", "iOS");
            case "tablet":
                return new ProductTablet("Apple", "ipadOS");
            case "laptop":
                return new ProductLaptop("Apple", "MacOS");
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}