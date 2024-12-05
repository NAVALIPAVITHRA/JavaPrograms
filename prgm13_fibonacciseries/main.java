import java.util.Scanner;
public class main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
   int first=0;
   int sec=1;
   int third=0;
   for(int i=2;i<=n;i++){
    third=first+sec;
    first=sec;
    sec=third;
   }
System.out.println(third);


}
}