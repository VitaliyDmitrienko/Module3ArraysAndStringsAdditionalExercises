// Module 3. Arrays & Strings. Additional exercises. #9 "revert sort array"

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main9 {
    public static void main(String[] args) {
        int[] array = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};
        int flag;

        for (int i = array.length - 1; i >= 0; i--) System.out.print(array[i] + ", ");
        System.out.println();

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ", ");
        System.out.println("\n" + array.length);

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] < array[j + 1]) {
//                    flag = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = flag;
//                }
//            }
//            System.out.print(array[i] + ", ");
//        }
//        System.out.println();


        int[] sortedDesc = Arrays.stream(array)            // или использовать, IntStream.of(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(sortedDesc));

        Integer[] arr = {4, 2, 3, 1, 5};
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));



    }
}
