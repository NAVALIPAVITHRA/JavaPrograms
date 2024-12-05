import java.util.Scanner;

public class main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("no.of input:");
        int n=sc.nextInt();
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int avg = (a+b+c)/n;
        System.out.println(avg);
        sc.close();

    }
}