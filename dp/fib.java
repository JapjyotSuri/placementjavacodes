package dp;
public class fib {
    public static int fib(int n,int arr[]){
         if(n<=1){
            return n;
         }
        if(arr[n]!=-1){
            return arr[n];
        }
        arr[n]=fib(n-1,arr)+fib(n-2,arr);
        return arr[n];
    }
    public static void main(String args[]){
        int n=5;
        int arr[]=new int[n+1];//as the value of n will be from 0 to n
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        System.out.println(fib(n,arr));
    }
    
}
