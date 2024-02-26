package test;

import java.util.Scanner;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть вашу дату народження у форматі ДДММРРРР (наприклад, 01011990): ");
        String birthDate = scanner.nextLine();

        int day = Integer.parseInt(birthDate.substring(0, 2));
        int month = Integer.parseInt(birthDate.substring(2, 4));
        int year = Integer.parseInt(birthDate.substring(4));

        int destinyNumber = Exercise.Calculate(day, month, year);

        System.out.println("Ваше число долі: " + destinyNumber);

        scanner.close();
    }
}