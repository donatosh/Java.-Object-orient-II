package Interfaces.Comparable.SortComparableObjects;
import java.math.*;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Севастополь", "Брянск", "Архангельск", "Тамбов"};
        java.util.Arrays.sort(cities);
        for (String city: cities)
            System.out.print(city + " ");
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),
                new BigInteger("432232323239292"),
                new BigInteger("54623239292")};
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number: hugeNumbers)
            System.out.print(number + " ");
    }
}
