package AbstractAndInterfaces.Task18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestRationalClass {
    public static void main(String[] args) {

        Rational r1, r2;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое рациональное число: ");
        // Создать и инициализировать два рациональных числа r1 и r2
         while (true) {
             try {
                 r1 = new Rational(input.nextLong(), input.nextLong());
                 break;
             } catch (InputMismatchException ex) {
                 System.out.print("Введите целое число через пробел: ");
                 input.next();
             }
         }

        System.out.print("Введите второе рациональное число: ");
        while (true) {
            try {
                r2 = new Rational(input.nextLong(), input.nextLong());
                break;
            } catch (InputMismatchException ex) {
                System.out.print("Введите целое число через пробел: ");
                input.next();
            }
        }

        System.out.println(r1);
        // Отобразить результаты
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " равно " + r2.doubleValue());
    }
}
