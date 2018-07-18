public class Workbook extends Stationery {
    private int pages;

    enum WbType {
        line, cage
    }

    private WbType wbType;

    Workbook(String name, int cost, String barcode, String manufacturer, int pages, WbType wbType) {
        super(name, cost, barcode, manufacturer);
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
    private Stationery stationery = new Stationery(name,cost,barcode,manufacturer);

    @Override
    public String toString() {
        return (stationery.getFullInfo() + ", количество страниц: " + pages
                + ", тип: " + getType(wbType));
    }
}
