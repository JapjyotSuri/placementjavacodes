package classqs;

public class power {
    
    static double  pro=1;
    public static double solve(double d,int n){
        if(n<0){
            
            return solve((1/d),Math.abs(n));
        }
        if(n==1){
            return d;            
        }
        if(n%2!=0){
            double a=solve(d,(n-1)/2);
            pro=d*a*a;
        }
        else{
        double a=solve(d,n/2);
        pro=a*a;
        // System.out.println(pro);
        }
        return pro;
    }
    public static void main(String[] args){
          System.out.println(solve(3,-3));
          System.out.println(-5%2);
    }
}

