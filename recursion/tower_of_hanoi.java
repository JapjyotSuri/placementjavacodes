package recursion;
import java.util.*;
public class tower_of_hanoi {
    public static void solve(int n,String src,String helper,String dest){
        if(n==0){
            return;
        }
        solve(n-1,src,dest,helper);
        System.out.println("sending disk "+ n + " from " + src + " to " + dest);
        solve(n-1,helper,src,dest);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n,"A","B","C");
    }
}
