package classqs;
import java.util.*;
public class mergesort {
    public static void merge(int a[],int s,int mid,int e){
    
    int left[]=new int[mid-s+1];

    int right[]=new int[e-mid];
    int l=left.length;
    int r=right.length;
    for(int i=0;i<l;i++){
        left[i]=a[s+i];
    }
    for(int i=0;i<r;i++){
        right[i]=a[mid+1+i];
    }
    int i=0;
    int j=0;
    int k=s;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
            a[k++]=left[i++];
            }
            else {
                a[k++]=right[j++];
            }     
        }
        while(i<left.length ){
            a[k++]=left[i++];
        }
        while(j<right.length){
            a[k++]=right[j++];
        }
}
    public static void mergesort(int a[],int s,int e){
       if(s>=e){
        return;
       }
       int mid=(s+e)/2;
       mergesort(a,s,mid);
       mergesort(a,mid+1,e);
       merge(a,s,mid,e);
    }
    
    public static void main(String args[]){

        int arr[]={3,5,2,4,6};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
