package task1;

public class Example {
    public static void main(String[] args) {
        try {
            int number = -10;
            if (number < 0) {
                throw new InvalidInputException("Число должно быть положительным");
            }
            System.out.println("Число: " + number);
        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}