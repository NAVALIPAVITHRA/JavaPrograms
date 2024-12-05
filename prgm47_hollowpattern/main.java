package prgm47_hollowpattern;
public class main{
public static void rectangle(int r,int c )
//outer loops
{ 
    for(int i=1;i<=r;i++)
    {
        //inner loop
        for(int j=1;j<=c;j++)
        {
            if(i==1 || i == r || j==1 || j==c)
            {
                System.out.println("*");
            }
            else{
                System.out.println(" ");
            }
        }
    }
    System.out.println();

}

public static void  main(String args[]) {
    rectangle(10,7);
    
}
}