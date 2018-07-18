public class Meat extends Products {
    enum MeatType {
        pork, chicken, beef
    }

    private MeatType meatType;


    Meat(String name, int cost, String barcode, String manufactureDate, int shelfLife, MeatType meatType) {
        super(name, cost, barcode, manufactureDate, shelfLife);
        this.meatType = meatType;
    }


    private String getMeatType(MeatType meatType) {
        switch (meatType) {
            case pork:
                return "свинина";
            case beef:
                return "говядина";

        }
        return "курица";
    }
    private Products products = new Products(name,cost,barcode,manufactureDate,shelfLife);
    @Override
    public String toString() {
        return (products.getFullInfo() + ", тип мяса: " + getMeatType(meatType));
    }
}
