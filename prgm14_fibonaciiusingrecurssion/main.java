

public class main {
    public static void main(String[] args) {
        int n = 4; // You can change this value to get different Fibonacci numbers
        int result = fib(n);
        System.out.println(result);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}