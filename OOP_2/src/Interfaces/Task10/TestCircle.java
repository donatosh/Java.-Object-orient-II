package Interfaces.Task10;

import static java.util.Arrays.sort;

public class TestCircle {
    public static void main(String[] args) {
        ComparableCircle[] cArr = {
                new ComparableCircle(1),
                new ComparableCircle(8),
                new ComparableCircle(4),
                new ComparableCircle(10),
                new ComparableCircle(7),
                new ComparableCircle(3)};

        sort(cArr);

        for (ComparableCircle circle : cArr){
            System.out.println(circle);
        }

        System.out.println(cArr[3].compareTo(cArr[1]));
    }
}
