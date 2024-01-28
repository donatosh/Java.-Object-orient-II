package AbstractAndInterfaces.Task20;

import java.math.BigInteger;

class RationalUsingBigInteger extends Number {
    // Поля данных для числителя и знаменателя
    private BigInteger numerator;
    private BigInteger denominator;

    /** Создает рациональное число с заданными по умолчанию свойствами */
    public RationalUsingBigInteger() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }
    public RationalUsingBigInteger(String str){
        String[] items = str.split("[.]");

        if (str.length()  == 1) {
            this.numerator = new BigInteger(items[0]);
            this.denominator = BigInteger.ONE;
        } else {
            this.denominator = BigInteger.ONE;
            for(int i = 0; i < items[1].length(); i++){
                this.denominator = BigInteger.valueOf(10).multiply(this.getDenominator());
            }
            this.numerator = new BigInteger(items[0] + items[1]);
        }

        long gcd = gcd(this.numerator.longValue(), this.denominator.longValue());
        this.numerator = this.numerator.divide(BigInteger.valueOf(gcd));
        this.denominator = this.denominator.divide(BigInteger.valueOf(gcd));
    }

    /** Создает рациональное число с указанным числителем и знаменателем */
    public RationalUsingBigInteger(BigInteger numerator, BigInteger denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
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

