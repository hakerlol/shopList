public class Workbook extends Stationery {
    private int pages;

    enum WbType {
        line, cage
    }

    private WbType wbType;

    Workbook(String name, int cost, String barcode, String manufacturer, int pages, WbType wbType) {
        super(name, cost, barcode, manufacturer);
        if (pages <= 0) {
            throw new IllegalArgumentException("Количество странциц не может быть отрицательным " + getClass());
        }
        this.pages = pages;

        this.wbType = wbType;
    }

    private String getType(WbType wbType) {
        switch (wbType) {
            case line:
                return "в линейку";

        }
        return "в клетку";
    }

    @Override
    public String toString() {
        return ("Имя товара: " + name + ", цена: " + cost + ", штрих-код: " + barcode + ", производитель: " + manufacturer + ", количество страниц: " + pages
                + ", тип: " + getType(wbType));
    }
}
