package Interfaces.Comparable.Task11;

import static java.lang.Math.pow;

public class Square extends GeometricObject implements Colorable {
    private double side;
    private String aColor;
    private String bColor;
    private String cColor;
    private String dColor;

    public Square(){
        this.side = 0;
    }
    public Square(double side){
        this.side = side;
    }

    private void setColor(String aColor, String bColor, String cColor, String dColor){
        this.aColor = aColor;
        this.bColor = bColor;
        this.cColor = cColor;
        this.dColor = dColor;
    }

    @Override
    public String toString(){
        return "Сторона a: " + this.side + " Площадь квадрата: " + this.getArea();
    }

    @Override
    public double getArea(){
        return pow(side, 2);
    }

    @Override
    public void howToColor(){
        System.out.println("Раскрасьте все четыре стороны");
    }
}
