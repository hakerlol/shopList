public class Meat extends Products {
    enum MeatType {
        pork, chicken, beef
    }

    private MeatType meatType;


    Meat(String name, int cost, String barcode, String manufactureDate, int shelfLife, MeatType meatType) {
        super(name, cost, barcode, manufactureDate, shelfLife);
        this.meatType = meatType;
    }


    private String getName(MeatType meatType) {
        switch (meatType) {
            case pork:
                return "свинина";
            case beef:
                return "говядина";

        }
        return "курица";
    }

    @Override
    public String toString() {
        return ("Имя товара: " + name + ", цена: " + cost + ", штрих-код: " + barcode + ", дата изготовления: " + manufactureDate + ", срок годности: "
                + shelfLife + " суток" + ", тип мяса: " + getName(meatType));
    }
}
