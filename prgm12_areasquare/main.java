import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int side=sc.nextInt();
        float area = side*side;
        System.out.println("area:"+area);
        sc.close();
    }
}