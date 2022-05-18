public class Fibonacci {
    public static void main(String[] args) {
        int fibNumber = 10;
        System.out.println("\nRecursive Fibonacci Sequence: 10");
        System.out.println("The " + fibNumber + "th term of the Fibonacci sequence is " + fibonacciRecursive(fibNumber));
    }//End Main

    /**
     *This method is a static recursive method that finds the nth term of the fibonacci sequence
     *
     * @author      Josh
     * @param   n   a user-defined integer
     * @return      The nth term of the Fibonacci sequence as an integer
     */
    public static int fibonacciRecursive(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
}
