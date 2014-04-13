package dynamicProgramming;

public class PartitionProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[]{1,5,11,5};
		Integer sum = 11;
		Boolean[][] dp = new Boolean[arr.length][sum];
		PartitionProb obj = new PartitionProb();
		System.out.println(obj.recurse(arr, sum, dp, arr.length));
	}
	
	public Boolean recurse(Integer[] arr, Integer sum, Boolean[][] dp, Integer n){
		if(sum==0)
			return true;
		
		if(sum<0 || n<=0)
			return false;
		
		if(dp[n-1][sum-1]!=null){
			return dp[n-1][sum-1];
		}
		Boolean returnVal=false;
		returnVal = recurse(arr,sum-arr[n-1],dp,n-1);
		returnVal |= recurse(arr,sum,dp,n-1);
		dp[n-1][sum-1] = returnVal;
		return dp[n-1][sum-1];
	}

}
