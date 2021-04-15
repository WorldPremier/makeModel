package com.tts;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Collections;
import java.io.Console;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five numbers ");

int sumNum = 0;
        List <Integer> fiveNumList = new ArrayList<>();
        for(int i = 0; i<5; i++){
        int intInput = sc.nextInt();
            System.out.println("Here is your numbers: " + intInput);
            fiveNumList.add(intInput);
            sumNum += intInput;

        }

        int maxNum = fiveNumList.get(0);
        int minNum = fiveNumList.get(0);

        int x = 0;
        int y = 100;

        do{

        for(x = 0; x>0; x--){
            minNum += x;
        }
        for(x = 0; x<100; x++){
            maxNum -= x;
        }
        }while(maxNum >minNum && minNum < maxNum);


        Collections.sort(fiveNumList);
        minNum = fiveNumList.get(0);
        maxNum = fiveNumList.get(fiveNumList.size() - 1);

        System.out.println("Your total number is: " + sumNum);
        System.out.println(fiveNumList);
        System.out.println("The smallest is %d%n " + minNum);
        System.out.println("The largest %d%n " + maxNum);


        System.out.println("\n==== Loop Map Exercise ====");



        Map<String, String> vehicleInventory = new HashMap<>();

        vehicleInventory.put("rav4", "Toyota" );
        vehicleInventory.put("civic", "Honda");
        vehicleInventory.put("camaro","Chevy");
        vehicleInventory.put("sentra","Nissan");
        vehicleInventory.put("explorer","Ford");
        vehicleInventory.put("jetta","Volkswagen");

        System.out.println("What model are you looking for?" );
        String carName = sc.next();

        if(vehicleInventory.containsKey(carName.toLowerCase())){
            System.out.println("Oh, I see! you're looking for a " + carName + " ?");
//            vehicleInventory.get(carName);

            for(String i : vehicleInventory.keySet()){
                if(i.equalsIgnoreCase(carName)){
                    System.out.println("Model: " + carName + "\t Make: " + vehicleInventory.get(carName));
                }
            }
        }else{
            System.out.println("Sorry we currently do not have any " + carName + " vehicle");
        }



        System.out.println("Our exclusive vehicle inventory are: ");
        List<String> cars = new ArrayList<>();

        // Adding new elements to the ArrayList
        cars.add("Rav4");
        cars.add("Infinity");
        cars.add("Eclipse");
        cars.add("Saturn");

//        System.out.println(cars);

        // Adding an element at a particular index in an ArrayList
        cars.add(2, "BMW");

        System.out.println(cars);

    }
}




