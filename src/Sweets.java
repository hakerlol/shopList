public class Sweets extends Products {
    private int cal;

    Sweets(String name, int cost, String barcode, String manufactureDate, int shelfLife, int cal) {
        super(name, cost, barcode, manufactureDate, shelfLife);
        this.cal = cal;

    }


    @Override
    public String toString() {
        return (getFullInfo() + ", каллории: " + cal);
    }
}
