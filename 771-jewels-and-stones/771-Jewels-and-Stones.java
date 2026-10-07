class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans =0;
        for(int i=0;i<stones.length();i++){
            char ch = stones.charAt(i);
            for(int j=0;j<jewels.length();j++){
                if(ch==jewels.charAt(j)){
                    ans = ans +1;
                    break;

                }
            }
        }
        return ans;
        
    }
}