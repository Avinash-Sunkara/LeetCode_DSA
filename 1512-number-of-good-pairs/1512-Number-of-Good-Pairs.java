class Solution {
    public int numIdenticalPairs(int[] nums) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int ans=0;
		for(int i=0;i<nums.length;i++){
		    if(map.containsKey(nums[i])){
		        map.put(nums[i],map.get(nums[i])+1);
		    }
		    else{
		        map.put(nums[i],1);
		    }
		}
        	for (int i:map.keySet()){
		        int val=map.get(i);
		        ans = ans+(val*(val-1))/2;
		    }
        return ans;
    }
}