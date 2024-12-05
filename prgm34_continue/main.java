import java.util.Scanner;

public class main{
    public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  do{
  int n=sc.nextInt();
   if(n%10==0){
     continue;
   }
  System.out.println(n);
}while(true);
}
}