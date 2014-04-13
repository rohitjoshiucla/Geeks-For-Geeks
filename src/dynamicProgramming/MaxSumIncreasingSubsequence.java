package dynamicProgramming;

public class MaxSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[]{1, 101, 2, 3, 100, 4, 5 };
		Integer[] dp = new Integer[arr.length];
		MaxSumIncreasingSubsequence obj = new MaxSumIncreasingSubsequence();
		obj.recurse(arr, dp, Integer.MAX_VALUE, arr.length);
		obj.print(dp);
		
	}
	public Integer recurse(Integer[] arr, Integer[]dp, Integer min, Integer n){
		
		if(dp[n-1]!=null)
			return dp[n-1];
		if(n==1){
//			dp[n-1] = arr[0];
			dp[n-1] = 1;
			return dp[n-1];
		}
		
		if(arr[n-1]<min){
//			dp[n-1] = arr[n-1] + recurse(arr,dp,arr[n-1],n-1);
			dp[n-1] = 1 + recurse(arr,dp,arr[n-1],n-1);
			return dp[n-1];
		}
		else{
//			dp[n-1] = arr[n-1] + recurse(arr,dp,Integer.MAX_VALUE,n-1);
			dp[n-1] = 1 + recurse(arr,dp,arr[n-1],n-1);
			return recurse(arr,dp,min,n-1);
		}
//			dp[n-1] = max(arr[n-1]+recurse(arr,dp,Integer.MAX_VALUE,n-1), recurse(arr,dp,arr[n-1],n-1));
		
		
	}
	
	public Integer max(Integer a, Integer b){
		return (a>b)?a:b;
	}
	
	public void print(Integer[] arr){
		for(Integer i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
