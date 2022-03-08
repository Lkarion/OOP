package com.company;

public class Computer {
    //Make a class Computer with the following attributes (String cpu, int ram, int hdd, double price).
    // Implement the method that print all information about the Computer.
    // Create several objects of Computer and put it into array. Print all computers.
    String cpu;
    int ram, hdd;
    double price;
    public static void printInfo(Computer comp){
        System.out.println("cpu - "+comp.cpu+"\nram - "+comp.ram+"\nhdd - "+comp.hdd+"\nprice - "+comp.price);
    }
}
