package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jan");
        map.put(2, " Kamil");
        map.put(3, "Zosia");

        System.out.println(map);

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println("klucz: " + m.getKey());
            System.out.println("Wartosc: " + m.getValue());
        }
        Map<String, List<String>> food = new HashMap<>();
        // WEGAN, HALAL, Koszerne
        List<String> wegan = new ArrayList<>();
        wegan.add("Jajka");
        wegan.add("Ser");
        wegan.add("Tofu");

        List<String> halal = new ArrayList<>();
        halal.add("Baran");
        halal.add("Kurczak");
        halal.add("Salami");

        List<String> koszerne = new ArrayList<>();
        koszerne.add("Marchewka");
        koszerne.add("ciastka");
        koszerne.add("humus");

        food.put("wegan ", wegan);
        food.put("halal", halal);
        food.put("koszerne ", koszerne);

        System.out.println(food);
        for (Map.Entry<String, List<String>> m : food.entrySet()) {
            System.out.println(m.getKey());
            List<String> values = food.get(m.getKey());
            for (String val : values) {
                System.out.println(" -" + val);
            }

        }
        Map<Student, List<List<String>>> foodMenu = new HashMap<>();
        Student student1 = new Student("jan", "kowalski", 1);
        Student student2 = new Student("michal", "kowalski", 1);

        List<List<String>> dni = new ArrayList<>();
        List<String> dania = new ArrayList<>();

        dania.add("jajka");
        dania.add("makaron");
        dania.add("ryba");

        dni.add(dania); //poniedzialek
        List<String> daniaWtorek = new ArrayList<>();
        daniaWtorek.add("pomodorowa");
        daniaWtorek.add("ryz");

        dni.add(daniaWtorek); //wtorek

        foodMenu.put(student1, dni);

        for (Map.Entry<Student, List<List<String>>> mapData : foodMenu.entrySet()) {
            Student key = mapData.getKey();
            List<List<String>> dataList = foodMenu.get(key);
            System.out.println("imie: " + key.getName() + " nazwisko: " + key.getLastname());

            for (List<String> List : dataList) {
                for (String str : List) {
                    System.out.println(str);
                }
                System.out.println("=========");
            }
        }
    }
}
