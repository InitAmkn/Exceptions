class Answer1 {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        Integer[] arr = new Integer[10];
        arr[100] = 25;

    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a1 = 20/0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String s1 = "hfgh";
        Integer a1 = Integer.parseInt(s1);

    }
}

public class Printer1 {
    public static void main(String[] args) {
        Answer1 ans = new Answer1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}