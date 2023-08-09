package task4;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int result = divide(10, 0); // Ошибка: деление на ноль
        System.out.println("Результат: " + result);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return a / b;
    }
}