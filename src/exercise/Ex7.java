package exercise;

public class Ex7 {
    public static void main(String[] args) {
        getArithmeticSequence(4, 2, 1);
    }

    public static void getArithmeticSequence(int length, int difference, int firstValue){
        int[] arithmeticSequence = new int[length];
        arithmeticSequence[0] = firstValue;

        for (int i =1; i<length;i++){
            arithmeticSequence[i] = arithmeticSequence[i-1]+difference;
        }

        for (int elelment:arithmeticSequence){
            System.out.print(elelment + ", ");
        }
    }
}
