package classqs;

public class fibi {
    public static int fib(int n){
        if(n==0 ||  n==1){
            return n;
        }
        int fibi=fib(n-1)+fib(n-2);
        return fibi;
    }
    public static void main(String args[]){
        int n=5;
        int ans=fib(5);
        System.out.println(ans);
    }
}
