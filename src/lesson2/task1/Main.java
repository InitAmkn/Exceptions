package lesson2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidNumberException {

        PositiveNumber num = new PositiveNumber();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            num.setString(input);
            System.out.println(num);
        }
    }
}