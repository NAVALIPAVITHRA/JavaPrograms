import java.util.Scanner;

public class main{
    public static void main(String arg[]){
        Scanner sc=new Scanner((System.in));


        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n +" *"+i+"= "+n*i);

        }
    }
}