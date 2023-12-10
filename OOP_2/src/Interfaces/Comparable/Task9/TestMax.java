package Interfaces.Comparable.Task9;

public class TestMax {
    public static void main(String[] args) {
        GeometricObject o1 = new Rectangle(1, 1);
        GeometricObject o2 = new Rectangle(2,2);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println();
        System.out.println(GeometricObject.max(o1, o2));
    }
}
