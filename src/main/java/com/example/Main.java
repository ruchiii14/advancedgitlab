package com.example;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Date date = new Date();
        System.out.println(date.toString());
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hola " + name + " , que tal?");
        scanner.close();
        System.out.println("Very nice to meet you!!!");

        System.out.println("New changes to see how stasg works");
    }

}
