
public class main{
public static void rectangle(int r )
{
for(int i =1;i<=r;i++)
{
    for(int j=1;j<=(r-i);j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
 
    }
    System.out.println();
}

}


   

public static void  main(String args[]) {
    rectangle(4);
}}