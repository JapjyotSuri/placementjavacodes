package recursion;
import java.util.*;
public class class1{
    public static void printrev(int i,int n){
        if(i>n){
            return;
        }
        printrev(i+1,n);
        System.out.println(i);
    }
    public static void printn(int i,int n){
        if(i>n){//base
        return;
        }
        System.out.println(i);
        printn(i+1,n);//backtracing step
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       printn(1,n);
       System.out.println();
       printrev(1,n);
    }
}