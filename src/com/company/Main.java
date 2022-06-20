package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
       HashMap<Car, Car2> cars = new HashMap<>();
       cars.put(new Car(12,7678), new Car2(2022,"black", 2500, "lexus470"));
        System.out.println(cars.entrySet());



    }
}
