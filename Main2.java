// Module 3. Arrays & Strings. Additional exercises. #2 "name + psw"

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        String userName;
        String userPassword;

        Scanner scanner = new Scanner(System.in);

        do {System.out.println("Enter User name (10-20 symbols): ");
            userName = scanner.nextLine();
            if ((userName.length() <10) || (userName.length() >20))
                System.out.println("User name: " + userName + " is out of range (8-15 symbols). Input length: "
                        + userName.length() + ". Enter right name again.");
        }
        while ((userName.length() < 10) || (userName.length() > 20));

        do {System.out.println("Enter User password (8-15 symbols): ");
            userPassword = scanner.nextLine().trim();
            if ((userPassword.length() <8) || (userPassword.length() >15))
                System.out.println("User password: " + userPassword + " is out of range (8-15 symbols). Input length: "
                        + userPassword.length() + ". Enter right password again.");
        } while (userPassword.length() <8 || userPassword.length() >15);

        System.out.printf("%s, Ваш новый пароль: %s", userName, userPassword);
    }

}
