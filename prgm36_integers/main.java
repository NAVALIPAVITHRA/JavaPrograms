import java.util.Scanner;
public class main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int ch;
        int evens=0;
        int odds=0;
        do{
            n=sc.nextInt();
            if(n%2==0){
                System.out.println("even");
                evens+=n;
            }
            else{
            System.out.println("odd");
            odds+=n;
            }
            System.out.println("do u want to continue");
            ch=sc.nextInt();
        }while(ch==1);

        System.out.println("even sum: "+evens);
        System.out.println("'odd sum: "+odds);
        sc.close()
;    }
}
        