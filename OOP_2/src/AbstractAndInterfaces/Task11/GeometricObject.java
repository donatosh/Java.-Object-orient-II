package AbstractAndInterfaces.Task11;

public abstract class GeometricObject {
    private String color = "белый";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Создает по умолчанию заданный геометрический объект */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Создает геометрический объект с указанными цветом и заливкой */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Возвращает цвет */
    public String getColor() {
        return color;
    }

    /** Присваивает новый цвет */
    public void setColor(String color) {
        this.color = color;
    }

    /** Возвращает заливку. Поскольку поле filled типа boolean,
     *  getter-метод называется isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Присваивает новую заливку */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Возвращает dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "создано " + dateCreated + "\nцвет: " + color +
                " и заливка: " + filled;
    }

    /** Абстрактный метод getArea */
    public abstract double getArea();

    /** Абстрактный метод getPerimeter */
    //public abstract double getPerimeter();
}

