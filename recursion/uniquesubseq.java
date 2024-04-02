package recursion;
import java.util.*;
public class uniquesubseq {
    static HashSet<String> map=new HashSet<>();
    public static void solve(String s,int idx,String ans){
        if(idx==s.length()){
            if(!map.contains(ans)){
                System.out.println(ans);
                map.add(ans);
            }
            return;
        }
        solve(s,idx+1,ans+s.charAt(idx));
        solve(s,idx+1,ans);
    }
    public static void main(String args[]){
        String str="aaa";
        String ans="";
        solve(str,0,ans);
        System.out.println(map);
        String a[]=new String[map.size()];
        map.toArray(a);
        for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
        }

    }
}
