package AbstractAndInterfaces.Practicum;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {

    private double side;

    public Octagon(){
        this.side = 0;
    }

    public Octagon(double side) {
        this.side = side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }

    @Override
    public double getArea() {
        return (2 + (4/Math.sqrt(2)))*side*side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(this.side, o.side);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
