import java.util.*;

class Solution {
    public boolean isValidPartition(int currAlpha[],int totalAlpha[]){
       for(int i = 0;i<26;i++){
           if(currAlpha[i] == 0 || currAlpha[i] == totalAlpha[i]) continue;
           else return false;
       }
       return true;
   }
   public List<Integer> partitionLabels(String s) {
       int n = s.length();
       int totalAlpha[] = new int[26];
       List<Integer> ans = new ArrayList<>();

       for(int i = 0;i<n;i++){
           totalAlpha[s.charAt(i)-97] += 1; 
       }

       int currAlpha[] = new int[26];
       int si = 0;
       int ei = 0;

       for(int i = 0;i<n;i++){
           currAlpha[s.charAt(i)-97]++;
           if(isValidPartition(currAlpha,totalAlpha)){
                ei = i; 
                ans.add(ei - si + 1);
                si = ei + 1;
           }
       }
       
       return ans;
   }
}