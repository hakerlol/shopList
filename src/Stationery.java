public class Stationery extends Items {
    String manufacturer;

    Stationery(String name, int cost, String barcode, String manufacturer) {
        super(name, cost, barcode);
        this.manufacturer = manufacturer;
    }
    String getFullInfo(){
        return ("Имя товара: " + name + ", цена: " + cost + ", штрих-код: " + barcode + ", производитель: " + manufacturer);

    }
    @Override
    public String toString() {
        return getFullInfo();
    }
}
