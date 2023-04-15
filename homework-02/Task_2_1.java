/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task_2_1 {

    public static void main(String[] args) {
        float userVal = getFloatVal();
        System.out.println();
        System.out.println("Вы ввели следующее значение:");
        System.out.println(userVal);
    }

    static float getFloatVal() {
    float val = 0;
    boolean status=true;
    while(status){
        InputStream UserInput = System.in;
        Reader inputReader = new InputStreamReader(UserInput);
        System.out.println("Введите значение с плавающей запятой:");
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        try {
            val=Float.parseFloat(bufferedReader.readLine());
            status=false;
            }
        catch (IOException | NumberFormatException exception) {
            System.out.println("Введенное значение не является числом или имеются какие-либо проблемы с вводом-выводом. \nПопробуйте еще раз!\n");
            //exception.printStackTrace();
            }
        }
    return val;
    }
}
