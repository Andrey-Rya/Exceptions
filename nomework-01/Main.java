import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

/* 
Реализуйте 3 метода, чтобы в каждом из них получить 
разные исключения
*/

// public class Main {
//     public static void main(String[] args) {
//         // show();
//         // parseMe();
//         sayHello(null); //NullPointerException
//     }

//     public static void show() throws FileNotFoundException{
//         var reader = new FileReader("file.txt"); //FileNotFoundException
//         System.out.println("Файл открыт!");
//     }

//     public static void parseMe() {
//         int myInt = Integer.parseInt("parseit (парсеит)"); //NumberFormatException
//         System.out.println(myInt);
//     }

//     public static void sayHello(String name) {
//         System.out.println(name.toUpperCase());
//     }

// }

/* 
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и 
возвращающий новый массив, каждый элемент которого равен разности элементов двух 
входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
 оповестить пользователя.
*/ 

public class Main {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 9, 7 };
        // int[] arr2 = { 4, 9, 7, 6 }; // проверка на разные длина массивов

        try {
            int[] result = subtractArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int[] subtractArrays(int[] arr1, int[] arr2) throws Exception {
        if (arr1.length != arr2.length)
            throw new Exception("Ошибка. Массивы разные по размеру. Требуется проверка!");
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
