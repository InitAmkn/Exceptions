package task3;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[4]); // Выход за границы массива
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }
    }
}