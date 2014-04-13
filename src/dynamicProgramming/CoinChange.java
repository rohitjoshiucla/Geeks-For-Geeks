package dynamicProgramming;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[]{1,5,10,25};
		Integer N  = 100;
		
		Integer[] dp = new Integer[N+1];
		CoinChange obj = new CoinChange();
		
		System.out.println(obj.recurse(arr,dp,100));
	}
	
	public Integer recurse(Integer[] arr, Integer[] dp, Integer n){
		
			
		if(n<0)
			return Integer.MAX_VALUE;
		if(dp[n]!=null)
			return dp[n];
		if(n==0){
			dp[n]=0;
			return dp[n];
		}
		Integer min = Integer.MAX_VALUE;
		Integer returnVal = 0;
		for(int i=0; i<arr.length; i++){
			returnVal = recurse(arr,dp,n-arr[i]); 
			min=(min>returnVal)?returnVal:min;
		}
		dp[n] = 1 + min;
		return dp[n];
	}
	

}
