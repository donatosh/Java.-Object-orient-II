package AbstractAndInterfaces.Comparable.SortRectangles;

public class ComparableRectangle extends Rectangle
        implements Comparable<ComparableRectangle> {
    /** Создает ComparableRectangle с указанными свойствами */
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override // Реализует метод compareTo, опеределенный в Comparable
    public int compareTo(ComparableRectangle o) {
        return (getArea() > o.getArea()) ? 1 : (getArea() < o.getArea()) ? -1 : 0;
    }

    @Override
    public boolean equals(Object o) {
        return super.getArea() == ((ComparableRectangle)o).getArea();
    }

    @Override // Реализует метод toString в GeometricObject
    public String toString() {
        return "Ширина: " + getWidth() + " Высота: " + getHeight() +
                " Площадь: " + getArea();
    }
}
