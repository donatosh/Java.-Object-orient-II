package AbstractAndInterfaces.Rational;

public class Rational extends Number implements Comparable<Rational> {
    // Поля данных для числителя и знаменателя
    private long numerator = 0;
    private long denominator = 1;

    /** Создает рациональное число с заданными по умолчанию свойствами */
    public Rational() {
        this(0, 1);
    }

    /** Создает рациональное число с указанным числителем и знаменателем */
    public Rational(long numerator, long denominator) {

        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
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
    public long getNumerator() {
        return numerator;
    }

    /** Возвращает знаменатель */
    public long getDenominator() {
        return denominator;
    }

    /** Прибавляет рациональное число к текущему */
    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /** Вычитает рациональное число из текущего */
    public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.getDenominator()
                - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /** Умножает рациональное число на текущее */
    public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    /** Делит на рациональное число текущее */
    public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.numerator;
        return new Rational(n, d);
    }

    @Override // Переопределяет метод toString класса Object
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override // Переопределяет метод equals класса Object
    public boolean equals(Object other) {
        if ((this.subtract((Rational)(other))).getNumerator() == 0)
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
        return numerator * 1.0 / denominator;
    }

    @Override // Реализует абстрактный метод longValue класса Number
    public long longValue() {
        return (long)doubleValue();
    }

    @Override // Реализует метод compareTo интерфейса Comparable
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
