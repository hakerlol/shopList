public class Pen extends Stationery {
    enum Color {
        black, white, blue, green, yellow, brown, gray;
    }

    enum Thickness {
        thin, medium, thick
    }

    private Color color;
    private Thickness thickness;

    Pen(String name, int cost, String barcode, String manufacturer, Color color, Thickness thickness) {

        super(name, cost, barcode, manufacturer);
        this.color = color;
        this.thickness = thickness;
    }

    private String getСolor(Color color) {
        switch (color) {
            case black:
                return "черный";
            case white:
                return "белый";
            case blue:
                return "синий";
            case green:
                return "зеленый";
            case yellow:
                return "желтый";
            case brown:
                return "коричневый";
        }
        return "серый";
    }

    private int getThickness(Thickness thickness) {
        switch (thickness) {
            case thin:
                return 1;
            case medium:
                return 2;

        }
        return 3;
    }


    @Override
    public String toString() {
        return (getFullInfo() + ", цвет: " + getСolor(color) + ", толщина: " + getThickness(thickness));
    }
}
