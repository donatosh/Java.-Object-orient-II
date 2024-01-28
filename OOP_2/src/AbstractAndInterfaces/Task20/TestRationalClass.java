package AbstractAndInterfaces.Task20;

import java.util.Scanner;

public class TestRationalClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        try {
            RationalUsingBigInteger rational = new RationalUsingBigInteger(in.nextLine());
            System.out.println(rational.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Введите число через точку");
        }

    }
}
