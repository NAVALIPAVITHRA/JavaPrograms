public class main {
    public static void main(String[] args) {
        try {
            long a = Long.parseLong("1111111111111111111111111111111111111");
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}