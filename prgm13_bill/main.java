import java.util.Scanner;

public class main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        float pen=sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float  total=(pen+pencil+eraser);
        System.out.println(total);
    }
}