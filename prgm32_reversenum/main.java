public class main{
    public static void main(String arg[]){
  int n=10899;
  int rev=0;
  while(n>0){
    int d=n%10;
    rev=(rev*10)+d;
    n=n/10;
  }
  System.out.println(rev);
    }}