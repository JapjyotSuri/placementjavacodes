package recursion;

public class class4 {
    static void reverse(int i,int n,int arr[]){
        if(i>=n){//base case
            return;
        }
        int temp=arr[i];//swapping elements
        arr[i]=arr[n];
        arr[n]=temp;
        reverse(i+1,n-1,arr);
        
    }
    static void reverse(int i,int arr[]){
        int n=arr.length;
        if(i>=n/2){//base case
            return;
        }
        int temp=arr[i];//swapping elements
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverse(i+1,arr);
        
    }
    static boolean palin(int i,String s){
        int n=s.length();
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
          return false;
        }
        palin(i+1,s);
        return true;
    }
    
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        //reverse(0,arr.length-1,arr);
        //arrays are passed using reference to anything changes in function reflects in arr in main
        reverse(0,arr);
        for(int j=0;j<arr.length;j++){//printing array
            System.out.println(arr[j]);
        }
        String s="abbab";
        
        if(palin(0,s)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }
    }
}
