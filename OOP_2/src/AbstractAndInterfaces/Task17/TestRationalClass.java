package AbstractAndInterfaces.Task17;

public class TestRationalClass {
    public static void main(String[] args) {

        // Создать и инициализировать два рациональных числа r1 и r2
        Rational r1 = new Rational(2, 4);
        Rational r2 = new Rational(2, 3);

        System.out.println(r1);
        // Отобразить результаты
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " равно " + r2.doubleValue());
    }
}
