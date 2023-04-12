//Реализуйте метод, который запрашивает у пользователя ввод дробного
// числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_01 {

    public static void floatNumb(){
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(work){
            System.out.print("Введите дробное число: ");
            try{
                float num = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное вами число %f\n", num);
                //work = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }

        }
    }

    public static void main(String[] args) {
        floatNumb();
    }
}
