package task2;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите ваш возраст:");
            int age = Integer.parseInt(scan.nextLine());
            if (age > 120 || age < 0) {
                throw new InvalidAgeException("Неправильно введен возраст");
            }
            System.out.println("Ваш возраст: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Некорректный формат числа");
        }
        scan.close();
    }
}