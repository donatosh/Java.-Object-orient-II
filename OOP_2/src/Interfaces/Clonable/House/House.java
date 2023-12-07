package Interfaces.Clonable.House;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }

    // Поверхостное клонирование - в новые поля копирутся ссылки из объекта
    /** Переопределяет protected-метод clone,
     определенный в классе Object, и расширяет его доступность */
    /*@Override
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }*/

    // Глубокое клонирование
    @Override
    public Object clone() {
        try {
            // Сделать поверхностную копию
            House houseClone = (House)super.clone();
            // Сделать глубокую копию whenBuilt
            houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
            return houseClone;
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    // Глубокое клонирование без clone
    /*@Override
    public Object clone() {
        // Сделать поверхностную копию
        House houseClone = new House(id, area);
        // Сделать глубокую копию whenBuilt
        houseClone.whenBuilt = new Date();
        houseClone.getWhenBuilt().setTime(whenBuilt.getTime());
        return houseClone;
    }*/

    @Override // Реализует метод compareTo, определенный в Comparable
    public int compareTo(House o) {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        else
            return 0;
    }
}