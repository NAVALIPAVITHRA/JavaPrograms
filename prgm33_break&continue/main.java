public class main {
    public static void main(String[] args) {
        int n = 1;
        while (n < 10) {
            if (n == 3) {
                System.out.println("hello");
            }
            System.out.println(n);
            n++; // Increment n to avoid infinite loop
        }
    }
}