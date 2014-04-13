package dynamicProgramming;


public class MaxLenChainOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] arr = new Integer[][]{{5, 24}, {15, 28}, {27, 40}, {39, 60}, {50, 90}};
		Integer[] dp = new Integer[arr.length];
		MaxLenChainOfPairs obj = new MaxLenChainOfPairs();
		obj.recurse(arr, dp, Integer.MAX_VALUE, arr.length);
		obj.print(dp);
	}
	public Integer recurse(Integer[][] arr, Integer[] dp, Integer min, Integer n){
		
		if(n==0)
			return 0;
		
		if(arr[n-1][1] < min){
			if(dp[n-1]!=null)
				return dp[n-1];
			
			dp[n-1] = 1 + recurse(arr, dp, arr[n-1][0], n-1);
			return dp[n-1];
		}
		else{
			dp[n-1] = 1 + recurse(arr, dp, arr[n-1][0], n-1);
			return recurse(arr,dp,min,n-1);
		}
	}
	public void print(Integer[] arr){
		for(Integer i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
