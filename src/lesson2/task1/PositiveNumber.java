package lesson2.task1;

/*
Задача 1:
        Напишите программу, которая запрашивает у пользователя число и проверяет,
        является ли оно положительным. Если число отрицательное или равно нулю,
        программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
        В противном случае, программа должна выводить сообщение "Число корректно".
*/
public class PositiveNumber {

    private Integer number;

    public void setNumber(Integer number) throws InvalidNumberException {
        this.number = verifiedNumbers(number);
    }

    private Integer verifiedNumbers(Integer number) throws InvalidNumberException {

        if (number < 0) {
            throw new InvalidNumberException("Число отрицательное");
        }
        return number;
    }

    public Integer setString(String str) throws InvalidNumberException{
        try {
            setNumber(Integer.parseInt(str));
        } catch (RuntimeException e) {
            throw new InvalidNumberException("некорректный ввод");
        }
        return number;
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
