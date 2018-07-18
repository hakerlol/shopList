public class Products extends Items {
    String manufactureDate;
    int shelfLife;


    Products(String name, int cost, String barcode, String manufactureDate, int shelfLife) {
        super(name, cost, barcode);
        this.manufactureDate = manufactureDate;
        this.shelfLife = shelfLife;
    }

    String getFullInfo(){
        return ("Имя товара: " + name + ", цена: " + cost + ", штрих-код: " + barcode + ", дата изготовления: " + manufactureDate + ", срок годности: " + shelfLife + " суток");
    }

    @Override
    public String toString() {
        return getFullInfo();
    }
}
