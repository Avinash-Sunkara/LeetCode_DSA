class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans =0;
        for(int i=0;i<sentences.length;i++){
            String s= sentences[i];
            int temp=1;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    temp++;
                }
                ans=Math.max(ans,temp);
            }
        }
        return ans;
    
    }
}