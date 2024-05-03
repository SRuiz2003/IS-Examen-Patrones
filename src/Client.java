import ConcreteFactorys.AppleFactory;
import ConcreteFactorys.HpFactory;
import ConcreteFactorys.SamsungFactory;
import Interfaces.ProductFactory;

class ElectronicsStore {
    public static void main(String[] args) {
        ProductFactory appleFactory = new AppleFactory();
        ProductFactory samsungFactory = new SamsungFactory();
        ProductFactory hpFactory = new HpFactory();

        ProductFactory.Product iPhone = appleFactory.createProduct("mobile");
        ProductFactory.Product galaxyTablet = samsungFactory.createProduct("tablet");
        ProductFactory.Product macBook = appleFactory.createProduct("laptop");
        ProductFactory.Product hpLaptop = hpFactory.createProduct("laptop");

        System.out.println(iPhone.getDetails());
        System.out.println(galaxyTablet.getDetails());
        System.out.println(macBook.getDetails());
        System.out.println(hpLaptop.getDetails());
    }
}