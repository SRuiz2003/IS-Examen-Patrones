
package Interfaces;

public interface ProductFactory {
        Product createProduct(String type);

        public interface Product {
                String getDetails();
        }
}

