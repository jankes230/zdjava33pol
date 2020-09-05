package exercise;

public class Ex9 {
    public static int modulofunction(int dividendNumber, int divider) {
        int modulo = dividendNumber - divider * (dividendNumber / divider);
        return modulo;
    }

    public static void printModulo(int dividendNumber, int divider) {
        System.out.println("The rest value: " + modulofunction(dividendNumber, divider));
    }

    public static void main(String[] args) {
        printModulo(12, 4);
    }
}
