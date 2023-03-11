// Module 3. Arrays & Strings. Additional exercises (1-14 + A1-A7). #10 "Warehouse (string)"

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {

//    String[] wareHouse = new String[12];
    static String[] wareHouse = new String[] {"гвозди", "молоток", "пила", "топор", "рубанок", "краска", "", "", "", "","", ""};
    static Scanner scanner = new Scanner(System.in);
    static int input;
    static String inputGoods;


    public static void main(String[] args) {
//        System.out.println(wareHouse.length);

        do {
            System.out.println("""
                    Введите номер операции для обработки склада:\s
                    (1) Вывести содержимое склада.
                    (2) Проверить наличие товара.
                    (3) Добавить товар.
                    (4) Удалить товар.
                    (0) Выход из программы.
                    """);
            input = scanner.nextInt();

            switch (input) {
                case (1) -> wareHousePrintGoods();
                case (2) -> wareHouseCheckGoods();
                case (3) -> wareHouseAddGoods();
                case (4) -> wareHouseRemoveGoods();
            }
        }
        while (input != 0);
        System.out.println("Работа программы завершена.");
    }

    public static void wareHousePrintGoods() {
        System.out.println("Товары на складе: " + Arrays.toString(wareHouse));
        System.out.println("Всего товаров  на складе: " + wareHouse.length + " из 12-ти.");
    }

    public static void wareHouseCheckGoods() {


    }

    public static void wareHouseAddGoods() {

    }

    public static void wareHouseRemoveGoods() {

    }

}
