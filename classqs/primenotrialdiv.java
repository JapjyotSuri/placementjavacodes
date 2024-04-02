package classqs;
import java.util.*;
public class primenotrialdiv {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>p=new ArrayList<>();
        p.add(2);
        for(int i=2;i<=n;i++){
            if(p.size()==0){
                p.add(i);
            }
            int k=0;
            boolean isPrime=false;
            while(k<Math.sqrt(p.size())){
                if(i%p.get(k)==0){
                    isPrime=false;
                    break;
                }
                else{
                    isPrime=true;
                    k++;
                }
            }
            if(isPrime==true){
                p.add(i);
            }


        }
        for(int i=0; i<p.size(); i++){
            System.out.print(p.get(i)+" ");
       }

    }
}
