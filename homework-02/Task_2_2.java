/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит 
пустую строку. Пользователю должно показаться сообщение, что пустые строки 
вводить нельзя. 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task_2_2 {

    public static void main(String[] args) {
        String userVal = getVal();
        System.out.println();
        System.out.println("Вы ввели следующую строку:");
        System.out.println(userVal);
    }

    static String getVal() {
        String val = "";
        System.out.println("\nВведите вашу строку:");
        InputStream UserInput = System.in;
        Reader inputReader = new InputStreamReader(UserInput);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        try {
            val = bufferedReader.readLine();
            if (val.isBlank()) {
                throw new IllegalArgumentException("Внимание! Ввод пустых строк запрещен!");
            }
        } catch (IOException exception) {
            System.out.println("Есть некоторые проблемы с вводом-выводом!");
            // exception.printStackTrace();
        }
        return val;
    }
}
