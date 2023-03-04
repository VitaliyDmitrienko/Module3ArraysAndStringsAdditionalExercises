// Module 3. Arrays & Strings. Additional exercises. #5 "Float point array"

package module3;

public class Main5 {
    public static void main(String[] args) {

        float[] array = {1.3f, 3.2f, 5.1f, 4.7f};
        float summ=0;
        float arrayMax=0;

        for (float value : array) System.out.print(value + " ");
        System.out.print("\n");
        for (float v : array) summ += v;
        System.out.println("Array summ= " + summ);
        for (int i=0; i < array.length; i++) {
            if (i==0) arrayMax = array[i];
            arrayMax = Math.max(arrayMax,array[i]);
        }
        System.out.println("Maximum array volume = " + arrayMax);
    }
}
