// Module 3. Arrays & Strings. Additional exercises (1-14 + A1-A7). #6 "word revert"

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {

    String singleWord;

    public static void main(String[] args) {
        String singleWord;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a single word: ");
            singleWord = scanner.nextLine();
//            singleWord = String.valueOf(scanner);
            if (singleWord.split(" ").length > 1)
                System.out.println("Input word is not a single. Enter right single word again.");
        } while (!isCorrectWordInput(singleWord) );

        System.out.println("Inputted a single word is: "  + singleWord);

        System.out.println("Reverted a single word is: " + reversWord (singleWord));


    }

    public static boolean isCorrectWordInput (String checkWord) {
//        System.out.println(checkWord + " " + checkWord.split(" ").length);
        return (checkWord.split(" ").length == 1);
    }

    public static String reversWord (String singleWord) {
        StringBuilder revertedWord = new StringBuilder();
        for (int i=(singleWord.length()-1); i>=0; i--) {
            revertedWord.append(singleWord.charAt(i));
        }
        return revertedWord.toString();

    }

}
