public class Fibonacci {
    public static void main(String[] args) {
        int fibNumber = 10;
        System.out.println("\nRecursive Fibonacci Sequence: 10");
        System.out.println("The " + fibNumber + "th term of the Fibonacci sequence is " + fibonacciRecursive(fibNumber));
    }//End Main

    public static int fibonacciRecursive(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
}
