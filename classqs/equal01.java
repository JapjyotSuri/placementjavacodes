package classqs;
import java.util.*;
public class equal01 {
    public static void main(String args[]){
        int cnt=0;
        int nums[]={1,0,1,0,0,1,1,0,1,1,0,0,1,1,0};
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
             sum=sum+nums[i];
            
             if(!map.containsKey(sum)){
                map.put(sum,1);
             }
             else{
                int val=map.get(sum);
                cnt=cnt+val;
                map.put(sum,val+1);
             }
        }
    System.out.println(cnt);
    }
}
