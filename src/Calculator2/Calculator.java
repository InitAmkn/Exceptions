package Calculator2;

class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super(message);
    }
}

class Calculator {
    public static void main(String[] args) {
        try {
            double result = calculate(5, '/', 0);
            System.out.println(result);
        } catch (CalculatorException e) {
            System.out.println("Ошибка калькулятора: " + e.getMessage());
        }
    }

    public static double calculate(double num1, char operator, double num2) throws CalculatorException {
        if (num2 == 0 && operator == '/') {
            throw new CalculatorException("Деление на ноль недопустимо");
        }
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new CalculatorException("Недопустимая операция");
        }
        // остальной код
        return num1;
    }
}