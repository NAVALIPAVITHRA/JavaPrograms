import java.util.Scanner;
public class main{
    public static void main(String arg[]){
Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
char operator= sc.next().charAt(0);
switch(operator){
    case '+':System.out.println(a+b);
    break;
    case '-':System.out.println(a-b);
    break;

case '*':System.out.println(a*b);
break;

case '/':System.out.println(a/b);
break;



}


}
}