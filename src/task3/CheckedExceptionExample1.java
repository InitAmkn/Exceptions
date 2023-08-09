package task3;


import java.io.IOException;

public class CheckedExceptionExample1 {
    public static void main(String[] args) throws IOException {
        throw new IOException("Пример проверяемого исключения");
    }
}
