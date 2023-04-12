// Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_04 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите текст: ");
        try {
            String result = reader.readLine();
            if(result.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");

            System.out.printf("Вы ввели: %s\n", result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
