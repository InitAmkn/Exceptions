package lesson2.task2;


import java.util.Scanner;
/*
Задача 2:
        Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
        Если второе число равно нулю,
        программа должна выбрасывать исключение DivisionByZeroException
        с сообщением "Деление на ноль недопустимо". В противном случае,
        программа должна выводить результат деления.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                Float x = Float.parseFloat(scanner.next());
                Float y = Float.parseFloat(scanner.next());
                if (y == 0)
                {
                    throw new DivisionByZeroException("Деление на ноль недопустимо");
                }

                Float z = x/y;

                System.out.println(z);

            }
            catch (DivisionByZeroException e) {
                throw new RuntimeException(e);
            }
            catch (Exception e)
            {
                throw new RuntimeException("Некорректный ввод");
            }
        }
    }
}