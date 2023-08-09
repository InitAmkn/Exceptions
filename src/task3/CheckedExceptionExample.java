package task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class CheckedExceptionExample {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file); // Ошибка: файл не найден
            System.out.println("Файл найден!");
        } catch (FileNotFoundException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }



    }
}