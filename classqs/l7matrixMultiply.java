package classqs;

import java.util.Scanner;

public class l7matrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int[][] arr2 = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n; j++){
                int sum = 0;
                for(int k=0; k<n; k++){
                    sum+=arr1[i][k]*arr2[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
    }

}

}
