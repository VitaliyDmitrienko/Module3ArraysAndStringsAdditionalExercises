// Module 3. Arrays & Strings. Additional exercises (1-14 + A1-A7). #7 "revers string array"

import java.util.Arrays;

public class Main7 {

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e", "f"};
        String[] array2 = {"a","b", "c", "d", "e", "f", "g"};

        revertStringArray (array);
        revertStringArray (array2);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));


    }

    public static void revertStringArray (String[] array) {
        int i,j;
        String cache1, cache2;
        for (i=0,j=array.length-1;i<j;i++,j--) {
            cache1 = array[i];
            cache2 = array[j];
            array[i] = cache2;
            array[j] = cache1;
        }
    }

}
