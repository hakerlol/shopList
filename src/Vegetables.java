public class Vegetables extends Products {
    enum VegType {
        lettuce, tomato, pumpkin
    }

    private VegType vegType;


    Vegetables(String name, int cost, String barcode, String manufactureDate, int shelfLife, VegType vegType) {
        super(name, cost, barcode, manufactureDate, shelfLife);
        this.vegType = vegType;
    }

    private String getName(VegType vegType) {
        switch (vegType) {
            case lettuce:
                return "салат";
            case tomato:
                return "томат";
        }

        return "тыквыенные";
    }
    private Products products = new Products(name,cost,barcode,manufactureDate,shelfLife);

    @Override
    public String toString() {
        return (products.getFullInfo() + ", тип овощей: " + getName(vegType));
    }
}
