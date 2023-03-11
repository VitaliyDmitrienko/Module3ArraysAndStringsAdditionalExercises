// Module 3. Arrays & Strings. Additional exercises (1-14 + A1-A7). #8 "change text"

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {

    static int input;
    public static void main(String[] args) {
        String originText = "Жили-были старик со старухой.\n" +
                "Вот и говорит старик старухе:\n" +
                "— Поди-ка, старуха, по коробу поскреби, по сусеку помети. Не наскребешь ли муки на колобок?\n";

        System.out.println("Введён оригинальный текст:\n" + originText);

        do {

            System.out.println("Введите номер операции для обработки исходного текста: \n" +
                    "(1) Удалить пробелы.\n" +
                    "(2) Сделать все заглавными или строчными.\n" +
                    "(3) Посчитать количество символов.\n" +
                    "(0) Выход из программы.\n");

            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();

            switch (input) {
                case (1) -> whiteSpaceRemove(originText);
                case (2) -> stringUpperCase(originText);
                case (3) -> stringLenght(originText);
            }
        }
        while ( input != 0);
        System.out.println("Работа программы завершена.");

    }

    public static void whiteSpaceRemove(String originText) {
        System.out.println("Обработанный текст без пробелов:\n" + originText.replace(" ",""));
        System.out.println("Длина текста без пробелов: " + originText.replace(" ","").length() + "\n");
    }

    public static void stringUpperCase(String originText) {
        System.out.println(originText.toUpperCase());
        System.out.println(originText.toLowerCase());

    }

    public static void stringLenght (String originText) {
        System.out.println("Длина оригинального текста: " + originText.trim().length() + "\n");

    }


}
