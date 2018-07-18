public class Sweets extends Products {
    private int cal;

    Sweets(String name, int cost, String barcode, String manufactureDate, int shelfLife, int cal) {
        super(name, cost, barcode, manufactureDate, shelfLife);
        if (cal <= 0) {
            throw new IllegalArgumentException("Калорийность не может быть отрицательным числом " + getClass());
        } else {
            this.cal = cal;
        }
    }

    @Override
    public String toString() {
        return ("Имя товара: " + name + ", цена: " + cost + ", штрих-код: " + barcode + ", дата изготовления: " + manufactureDate
                + ", срок годности: " + shelfLife + " суток" + ", каллории: " + cal);
    }
}
