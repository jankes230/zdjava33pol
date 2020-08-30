package exercise;

public class Ex6 {
    public static void main(String[] args) {
        int[] array = {0,4,-2,-8};
        countNegativeNumbers(array);
    }

    public static void countNegativeNumbers(int[] numbers){
        int counterOfNegativeNumbers = 0;
        for (int element:numbers){
            if(element<0){
                counterOfNegativeNumbers++;
            }
        }
        System.out.println(counterOfNegativeNumbers);
    }


}
