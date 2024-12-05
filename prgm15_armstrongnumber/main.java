

public class main {
    public static void main(String[] args) {
        int n=153;
        int N=n;
        int sum=0;
        while(n!=0){
            int dig=n%10;
            n=n/10;
            sum+=(dig*dig*dig);


        }
        if(sum==N)
        {
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong ");
        }
    }
}