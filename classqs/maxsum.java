package classqs;
import java.util.*;
public class maxsum {
    static int maxs=0;
    public static int sum(int s,int e){
        for(int )
    }
    public static void solve(int arr[],int s,int e,int sum){
        if(s>e){
            return;
        }
        int mid=(s+e)/2;
        int lefts=sum(s,mid-1);
        int rights=sum(s,mid+1);
        if(lefts>0){
            maxs=maxs+lefts;

        }
        if(rights>0){
            maxs=maxs+rights;
        }
        solve(arr,s,mid,sum);
        solve(arr,mid,e,sum);
    }
    public static void main(String args[]){
        int arr[]={1,2,-4,6,-3};
        
        solve(arr,0,arr.length-1,0);
    }
}
