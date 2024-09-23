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
        System.out.println("Hola " + name);
        scanner.close();

    }

}
