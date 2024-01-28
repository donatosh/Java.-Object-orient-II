package AbstractAndInterfaces.Task19;

import java.math.BigInteger;

public class TestRationalClass {
    public static void main(String[] args) {
        final int N = 100;
        RationalUsingBigInteger sum = new RationalUsingBigInteger();
        for (int i = 1; i <= N; i = i + 2) {
            sum = sum.add(new RationalUsingBigInteger(BigInteger.valueOf(i), BigInteger.valueOf(i + 1)));
        }
        System.out.println("Сумма ряда равна " + sum + " = " +
                sum.doubleValue());
    }
}
