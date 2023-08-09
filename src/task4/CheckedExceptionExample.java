package task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            readFromFile("example.txt"); // Ошибка: файл не найден
        } catch (FileNotFoundException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        } finally {
            System.out.println("finally");
        }
    }

    public static void readFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        System.out.println("Файл найден!");
    }
}