public class Stationery {
    String name;
    int cost;
    String barcode;
    String manufacturer;

    private boolean isNumeric(String barcode) {
        return barcode.matches("-?\\d+(\\.\\d+)?");
    }

    Stationery(String name, int cost, String barcode, String manufacturer) {
        if (name.trim().length() == 0) {
            throw new IllegalArgumentException("Имя не может быть пустым " + getClass());
        }
        this.name = name;

        if (cost <= 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной " + getClass());
        }
        this.cost = cost;
        if (barcode.trim().length() != 10 || !isNumeric(barcode)) {
            throw new IllegalArgumentException("Штрихкод не может таким " + getClass());
        }
        this.barcode = barcode;
        if (manufacturer.trim().length() == 0) {
            throw new IllegalArgumentException("Имя производителя не модет быть пустым " + getClass());
        }
        this.manufacturer = manufacturer;

    }

    @Override
    public String toString() {
        return ("Имя товара: " + name + ", цена: " + cost + ", штрих-код: " + barcode + ", производитель: " + manufacturer);
    }
}
