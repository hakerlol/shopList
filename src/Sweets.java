public class Sweets extends Products {
    private int cal;

    Sweets(String name, int cost, String barcode, String manufactureDate, int shelfLife, int cal) {
        super(name, cost, barcode, manufactureDate, shelfLife);
        this.cal = cal;

    }
    private Products products = new Products(name,cost,barcode,manufactureDate,shelfLife);

    @Override
    public String toString() {
        return (products.getFullInfo() + ", каллории: " + cal);
    }
}
