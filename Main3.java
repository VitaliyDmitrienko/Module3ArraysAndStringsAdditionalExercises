// Module 3. Arrays & Strings. Additional exercises. #3 "table of results"

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String [] names = {"Саша", "Игорь", "Миша", "Коля", "Владимир"};
        int i,j;
        int[] result = new int [5];
        int[][] points = {
                {4, 3, 2, 5, 1},
                {3, 4, 4, 6, 2},
                {2, 5, 4, 3, 2},
                {8, 4, 2, 0, 4},
                {4, 4, 3, 2, 9},
        };

        for (i=0; i<5; i++) {
            for (j=0; j<5; j++) result [i] += points[i][j];
        }

        for (i=0; i<5; i++) System.out.println("Имя игрока: <" + names[i] + ">. " + "Cумма баллов: <" + result[i] + ">.");
    }
}
