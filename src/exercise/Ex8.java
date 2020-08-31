package exercise;

public class Ex8 {
   public static void main(String[] args) {
        int[] arithmeticSequence = {2,4,6};
        printer(arithmeticSequence);
    }

    public static boolean isArithmeticSequence(int[] array){

       int firstDiffrence = array[1]-array[0];
       int notEquals = 0; //counter

       for (int i = 2; i<array.length; i++) {
           if (firstDiffrence==array[i]-array[i-1]) {
               continue;
           } else {
               notEquals++;
           }
       }

       if (notEquals==0){
           return true;
       }else {
           return false;
       }
    }

    public static void printer(int[] array){
        if(array.length<=2){
            System.out.println("Your sequence is too short");
            return;
        }
        while (isArithmeticSequence(array)){
           System.out.println("The sequence is arithmetic");
           break;
       }
       while (!isArithmeticSequence(array)){
           System.out.println("The sequence isn't aritmetic");
           break;
       }
    }
}