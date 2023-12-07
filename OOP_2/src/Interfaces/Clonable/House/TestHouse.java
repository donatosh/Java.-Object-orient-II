package Interfaces.Clonable.House;

import java.util.ArrayList;

public class TestHouse {
    public static void main(String[] args) {
        House house1 = new House(1, 1750.50);
        House house2 = (House)house1.clone();

        System.out.println(house1);
        System.out.println(house2);
        System.out.println("house1.getWhenBuilt() == house2.getWhenBuilt(): " + (house1.getWhenBuilt() == house2.getWhenBuilt()));

        System.out.println();
        java.util.Date date = new java.util.Date();
        java.util.Date date1 = date;
        java.util.Date date2 = (java.util.Date)(date.clone());
        System.out.println("date == date1: " + (date == date1));
        System.out.println("date == date2: " + (date == date2));
        System.out.println("date.equals(date2)" + (date.equals(date2)));

        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        list.add("Новосибирск");
        ArrayList<String> list1 = list;
        ArrayList<String> list2 = (ArrayList<String>)(list.clone());
        list.add("Астрахань");
        System.out.println(list == list1);
        System.out.println(list == list2);
        System.out.println("list равно " + list);
        System.out.println("list1 равно " + list1);
        System.out.println("list2.get(0) равно " + list2.get(0));
        System.out.println("list2.size() равно " + list2.size());

        System.out.println();
        House house3 = new House(1, 1750.50);
        House house4 = (House)house3.clone();
        System.out.println(house3.equals(house4));
    }
}
