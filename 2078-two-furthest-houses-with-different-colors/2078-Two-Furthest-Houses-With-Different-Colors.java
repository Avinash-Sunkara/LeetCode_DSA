class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int max=0;

        for(int i=0;i<n;i++){
            if(colors[i]!=colors[n-1]){
                max=Math.max(max,n-1-i);
                break;
            }
        }
        for(int i=n-1;i>0;i--){
            if(colors[i]!=colors[n-1]){
                max=Math.max(max,i);
            }
        }
        return max;
    }
}