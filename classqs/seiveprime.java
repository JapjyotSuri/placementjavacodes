package classqs;

import java.util.Scanner;

public class seiveprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean []primeList=new boolean[n+1];
        for(int i=2;i<n+1;i++){
            primeList[i]=true;
        }

        for(int i=2;i<n+1;i++){
            if(primeList[i]==true){
                for(int j=i*i;j<=n;j=j+i){
                    primeList[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(primeList[i]==true){
                System.out.print(i+" ");
            }
        }

        sc.close();

}

}
