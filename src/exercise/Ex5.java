package exercise;

public class Ex5 {
    public static void main(String[] args) {
        int[] array = {1};
        showBiggestAndSmallerstFromArray(array);
    }

    public static void showBiggestAndSmallerstFromArray(int[] number) {
        if (number.length < 1) {
            System.out.println("Array is empty");
            return;
        }

        int min = number[0];
        int max = min;
        for (int element : number) {
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        System.out.println("Max: " + max + ", min: " + min);
    }
}
