package Exceptions.CircleWithException;

public class CircleWithException {
    /** Радиус круга */
    private double radius;

    /** Количество созданных объектов */
    private static int numberOfObjects = 0;

    /** Создает круг с радиусом, равным 1 */
    public CircleWithException() {
        this(1.0);
    }

    /** Создает круг с указанным радиусом */
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    /** Возвращает радиус */
    public double getRadius() {
        return radius;
    }

    /** Присваивает новый радиус */
    public void setRadius(double newRadius)
            throws IllegalArgumentException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException(
                    "Радиус не может быть отрицательным");
    }

    /** Возвращает numberOfObjects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Возвращает площадь круга */
    public double findArea() {
        return radius * radius * 3.14159;
    }
}
