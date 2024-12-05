import java.util.Scanner;
public class main{
    public static void main(String arg[]){
Scanner sc =new Scanner(System.in);
int num=sc.nextInt();
if (num>=0){
    System.out.println("positive");
}
else{
    System.out.println("negative");
    sc.close();
}

}
}