import java.math.BigInteger;

public class FibonacciSeries {
    public static void main(string[] args) {

        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        System.out.printIn("First 100 numbers of the Fibonacci Series:");

        for (int i = 1; i <= 100; i++) {

            system.out.print(first + " ");

            BigInteger next = first.add(second);

            first = second;
            second =next;
        }
    }
}