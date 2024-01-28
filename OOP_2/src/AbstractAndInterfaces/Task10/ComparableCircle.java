package AbstractAndInterfaces.Task10;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle c){
        return getArea() > c.getArea() ? 1 : getArea() == c.getArea() ? 0 : -1;
    }

    @Override // Реализует метод toString в GeometricObject
    public String toString() {
        return "Радиус: " + getRadius() + " Площадь: " + getArea();
    }
}
