package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptopList = getLaptops();
        System.out.printf("Laptop count: %d \n", laptopList.size());
        Map<Integer, String> characteristicMap = new HashMap<>();
        characteristicMap.put(1, "RAM");
        characteristicMap.put(2, "storage");
        characteristicMap.put(3, "OS");
        characteristicMap.put(4, "color");
        characteristicMap.put(5, "diagonal");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите характеристики.\nобъем оперативной памяти: ");
        int ramUser = scanner.nextInt();
        System.out.print("объем накопителя: ");
        int storageUser = scanner.nextInt();
        System.out.print("диагональ: ");
        double diagonalUser = scanner.nextDouble();
        for (Laptop laptop : laptopList) {
            if ((laptop.getRam() >= ramUser) && (laptop.getStorage() >= storageUser) && laptop.getDiagonal() >= diagonalUser) {
                System.out.println(laptop);
            }
        }
        scanner.close();
    }

    private static List<Laptop> getLaptops() {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("Lenovo", 8, 256, "Windows 11", "Black", 17.4));
        laptopList.add(new Laptop("Honor", 16, 512, "Windows 10", "White", 14.5));
        laptopList.add(new Laptop("MacBook", 8, 256, "MacOs", "Red", 17.4));
        laptopList.add(new Laptop("HP", 4, 1024, "Windows 11", "Silver", 12.5));
        laptopList.add(new Laptop("Acer", 8, 256, "Ubuntu", "Silver", 18.5));
        laptopList.add(new Laptop("Honor", 4, 128, "Windows 11", "Black", 14.6));
        laptopList.add(new Laptop("Xiaomi", 4, 1000, "Windows 7", "White", 14.6));
        return laptopList;
    }
}