package Interfaces.Task14;

public class Rectangle extends GeometricObject implements Comparable <Rectangle> {
    private double width;
    private double height;

    /** Создает по умолчанию заданный прямоугольник */
    public Rectangle() {
    }

    /** Создает прямоугольник с указанной шириной и высотой */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** Создает прямоугольник с указанной шириной, высотой, цветом и заливкой */
    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /** Возвращает ширину */
    public double getWidth() {
        return width;
    }

    /** Присваивает новую ширину */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Возвращает высоту */
    public double getHeight() {
        return height;
    }

    /** Присваивает новую высоту */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Возвращает площадь */
    public double getArea() {
        return width * height;
    }

    /** Возвращает периметр */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Rectangle o) {
        return getArea() > o.getArea() ? 1 : getArea() == o.getArea() ? 0 : -1;
    }

    @Override
    public boolean equals(Object o) {
        return getArea() == ((Rectangle)o).getArea() ? true : false;
    }
}
