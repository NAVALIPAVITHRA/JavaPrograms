import java.util.Scanner;
public class main{
    public static void main(String arg[]){
Scanner sc =new Scanner(System.in);
  int n=sc.nextInt();
  int fact=1;
  for(int i=1;i<=n;i++)
  {
    fact*=i;
  }
System.out.println("factorial: "+fact);
}
}