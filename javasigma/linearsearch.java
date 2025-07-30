public class linearsearch{

    public static int linear(int n[],int key){
        for(int i=0;i<n.length;i++){
            if(n[i]==key){
                return i;
            }
      
        }
              return -1;
    }
    public static void main(String[] args){
        int n[]={1,2,3,4,5,6,7,8};
        int key=1;
        int indx=linear(n,key);
       if(indx==-1){
        System.out.println("not found");
       }
       else{
        System.out.println("found");
       }
    }
}