package recursion;
import java.util.*;
public class class3 {
    
    public static int sumfunc(int i){
        if(i<1){
            return 0;
        }
        int sumf=i+sumfunc(i-1);
        return sumf;
    }
    public static void sumparameterized(int i,int s){
        if(i<1){
            System.out.println(s);
            return;
        }
        sumparameterized(i-1,s+i);//adding value of i in sum and then reducing i by 1
    } 
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     sumparameterized(n,0);
     int ans=sumfunc(n);
     System.out.println(ans);
    }
}
