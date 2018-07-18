public abstract class Items {
    String name;
    int cost;
    String barcode;

    Items(String name, int cost, String barcode) {
        this.name = name;
        this.cost = cost;
        this.barcode = barcode;
    }

    @Override
    public abstract String toString();

}
