import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Products {
    String name;
    int cost;
    String barcode;
    String manufactureDate;
    int shelfLife;

    static boolean isValid(String value, String datePattern) {

        if (value == null || datePattern == null || datePattern.length() <= 0) {
            return false;
        }

        SimpleDateFormat formatter = new SimpleDateFormat(datePattern);
        formatter.setLenient(false);

        try {
            formatter.parse(value);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }


    private boolean isNumeric(String barcode) {
        return barcode.matches("-?\\d+(\\.\\d+)?");
    }


    Products(String name, int cost, String barcode, String manufactureDate, int shelfLife) {
        if (name.trim().length() == 0) {
            throw new IllegalArgumentException("Имя не может быть пустым " + getClass());
        } else {
            this.name = name;
        }
        if (cost <= 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной " + getClass());
        }
        this.cost = cost;
        if (barcode.trim().length() != 10 || !isNumeric(barcode)) {
            throw new IllegalArgumentException("Штрихкод не может таким " + getClass());
        }
        this.barcode = barcode;
        if (manufactureDate.trim().length() == 0) {
            throw new IllegalArgumentException("Дата изготовления не может быть отрицательной " + getClass());
        }
        this.manufactureDate = manufactureDate;
        if (!isValid(manufactureDate, "dd.MM.yyyy")) {
            throw new IllegalArgumentException("Введите дату в правильном формате: dd.MM.yyyy, например 15.03.2006. Или проверьте корректность введения даты" + getClass());
        } else {
            String[] arr = manufactureDate.split("\\.");
            String[] currentDate = LocalDate.now().toString().split("-");
            if (arr[2].length() > 4 || Integer.parseInt(arr[2]) > Integer.parseInt(currentDate[0])) {
                throw new IllegalArgumentException("Такого года пока не существует, проверьте корректность введения даты: " + arr[0] + "." + arr[1] + "." + arr[2] + " " + getClass());
            } else if (Integer.parseInt(arr[2]) == Integer.parseInt(currentDate[0]) && Integer.parseInt(arr[1]) > Integer.parseInt(currentDate[1])) {
                throw new IllegalArgumentException("Такого месяца пока не существует, проверьте корректность введения даты: " + arr[0] + "." + arr[1] + "." + arr[2] + " " + getClass());
            } else if (Integer.parseInt(arr[2]) == Integer.parseInt(currentDate[0]) && Integer.parseInt(arr[1]) == Integer.parseInt(currentDate[1])
                    && Integer.parseInt(arr[0]) > Integer.parseInt(currentDate[2])) {
                throw new IllegalArgumentException("Такого числа пока не существует, проверьте корректность введения даты: " + arr[0] + "." + arr[1] + "." + arr[2] + " " + getClass());

            }
        }


        if (shelfLife <= 0) {
            throw new IllegalArgumentException("Срок годности не может быть отрицательным " + getClass());
        }
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return ("Имя товара: " + name + ", цена: " + cost + ", штрих-код: " + barcode + ", дата изготовления: " + manufactureDate + ", срок годности: " + shelfLife + " суток");
    }
}
