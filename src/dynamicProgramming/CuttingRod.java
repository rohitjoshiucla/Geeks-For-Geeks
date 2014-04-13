package dynamicProgramming;

public class CuttingRod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] len = new Integer[]{1,2,3,4,5,6,7,8};
		Integer[] cost = new Integer[]{1,5,8,9,10,17,17,20};
		Integer targetLen = 8;
		Integer[] dp = new Integer[targetLen];
		CuttingRod obj = new CuttingRod();
		System.out.println(obj.recurse(len, cost, dp, 8));
		obj.print(dp);
	}
	public Integer recurse(Integer[] len, Integer[] cost, Integer[] dp, Integer targetLen){
		if(targetLen<=0)
			return 0;
		if(dp[targetLen-1]!=null)
			return dp[targetLen-1];
		Integer returnVal=0;
		Integer maxVal = 0;
		
		for(int i=0; i<len.length; i++){
			if(len[i]<=targetLen){
				returnVal = cost[i]+recurse(len,cost,dp,targetLen-len[i]);
				if(maxVal<returnVal){
					maxVal = returnVal;
					
				}
			}
		}
		dp[targetLen-1]=maxVal;
		return dp[targetLen-1];
	}
	
	public void print(Integer[] arr){
		for(Integer i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
