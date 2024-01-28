package AbstractAndInterfaces.Task18;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    // Поля данных для числителя и знаменателя
    //private long numerator = 0;
    //private long denominator = 1;
    private BigInteger[] r = new BigInteger[2];

    /** Создает рациональное число с заданными по умолчанию свойствами */
    public Rational() {
        this(0, 1);
    }

    /** Создает рациональное число с указанным числителем и знаменателем */
    public Rational(long numerator, long denominator) {

        long gcd = gcd(numerator, denominator);
        this.r[0] = BigInteger.valueOf((denominator > 0 ? 1 : -1) * numerator / gcd);
        this.r[1] = BigInteger.valueOf(Math.abs(denominator) / gcd);
    }

    /** Находит НОД двух чисел */
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

    /** Возвращает числитель */
    public BigInteger getNumerator() {
        return r[0];
    }

    /** Возвращает знаменатель */
    public BigInteger getDenominator() {
        return r[1];
    }

    /** Прибавляет рациональное число к текущему */
    public Rational add(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).add(r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n.longValue(), d.longValue());
    }

    /** Вычитает рациональное число из текущего */
    public Rational subtract(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).subtract(r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n.longValue(), d.longValue());
    }

    /** Умножает рациональное число на текущее */
    public Rational multiply(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getNumerator());
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n.longValue(), d.longValue());
    }

    /** Делит на рациональное число текущее */
    public Rational divide(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator());
        BigInteger d = r[1].multiply(secondRational.r[0]);
        return new Rational(n.longValue(), d.longValue());
    }

    @Override // Переопределяет метод toString класса Object
    public String toString() {
        if (r[1].intValue() == 1)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

    @Override // Переопределяет метод equals класса Object
    public boolean equals(Object other) {
        if ((this.subtract((Rational)(other))).getNumerator().intValue() == 0)
            return true;
        else
            return false;
    }

    @Override // Реализует абстрактный метод intValue класса Number
    public int intValue() {
        return (int)doubleValue();
    }

    @Override // Реализует абстрактный метод floatValue класса Number
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override // Реализует абстрактный метод doubleValue класса Number
    public double doubleValue() {
        return r[0].doubleValue() * 1.0 / r[1].doubleValue();
    }

    @Override // Реализует абстрактный метод longValue класса Number
    public long longValue() {
        return (long)doubleValue();
    }

    @Override // Реализует метод compareTo интерфейса Comparable
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator().doubleValue() > 0)
            return 1;
        else if (this.subtract(o).getNumerator().doubleValue() < 0)
            return -1;
        else
            return 0;
    }
}
