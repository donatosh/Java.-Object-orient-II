package AbstractAndInterfaces.Task19;

import java.math.BigInteger;

class RationalUsingBigInteger extends Number {
    // Поля данных для числителя и знаменателя
    private final BigInteger numerator;
    private final BigInteger denominator;

    /** Создает рациональное число с заданными по умолчанию свойствами */
    public RationalUsingBigInteger() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    /** Создает рациональное число с указанным числителем и знаменателем */
    public RationalUsingBigInteger(BigInteger numerator, BigInteger denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /** Возвращает числитель */
    public BigInteger getNumerator() {
        return numerator;
    }

    /** Возвращает знаменатель */
    public BigInteger getDenominator() {
        return denominator;
    }

    /** Прибавляет рациональное число к текущему */
    public RationalUsingBigInteger add(RationalUsingBigInteger second) {
        BigInteger n = numerator.multiply(second.getDenominator()).add(denominator.multiply(second.getNumerator()));
        BigInteger d = denominator.multiply(second.getDenominator());
        return new RationalUsingBigInteger(n, d);
    }

    // Переопределяет метод toString класса Object
    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    // Реализует абстрактный метод intValue класса Number
    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    // Реализует абстрактный метод floatValue класса Number
    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    // Реализует абстрактный метод doubleValue класса Number
    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    // Реализует абстрактный метод longValue класса Number
    @Override
    public long longValue() {
        return (long) doubleValue();
    }
}

