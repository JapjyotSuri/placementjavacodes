package classqs;
import java.util.*;
public class hashset {
    public static void main(String args[]){
        HashSet<Integer> m=new HashSet<>();
        int arr[]={1,2,3,4,2,1};
        for(int i=0;i<arr.length;i++){
            if(!m.contains(arr[i])){
                m.add(arr[i]);
            }
        }
        System.out.println(m);
    }
}
