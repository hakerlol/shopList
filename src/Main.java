import java.text.ParseException;
import java.util.Random;

public class Main {

    private static String createBarcode() {
        StringBuilder barcode = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            barcode.append(String.valueOf(random.nextInt(10)));
        }
        return barcode.toString();
    }


    public static void main(String[] args) throws ParseException {

        Meat meat = new Meat("Вкусное мясо", 6, createBarcode(), "18.07.2018", 5, Meat.MeatType.pork);
        Vegetables vegetables = new Vegetables("Тыква", 6, createBarcode(), "25.03.2018", 30, Vegetables.VegType.pumpkin);
        Sweets sweets = new Sweets("Леденец", 6, createBarcode(), "25.03.2001", 180, 8);
        Pen pen = new Pen("Шариковая ручка", 6, createBarcode(), "ErichKrause", Pen.Color.black, Pen.Thickness.thick);
        Pencil pencil = new Pencil("Простой карандаш", 6, createBarcode(), "ErichKrause", Pencil.Color.black, Pencil.Thickness.thin);
        Workbook workbook = new Workbook("Тетрадь для учебы", 6, createBarcode(), "ErichKrause", 1, Workbook.WbType.cage);
        System.out.println(meat + "\n" + vegetables + "\n" + sweets + "\n" + pen + "\n" + pencil + "\n" + workbook);

    }
}
