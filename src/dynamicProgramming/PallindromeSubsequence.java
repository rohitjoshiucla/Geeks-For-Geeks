package dynamicProgramming;

public class PallindromeSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="BBABCBCAB";
		char[] arr = input.toCharArray();
		Integer[][] dp = new Integer[arr.length][arr.length];
		PallindromeSubsequence obj = new PallindromeSubsequence();
		System.out.println(obj.recurse(arr, dp, 0, arr.length-1));
		obj.print(dp);
	}
	public Integer recurse(char[] arr, Integer[][] dp, Integer start, Integer end){
		if(start>end)
			return 0;
		if(start==end)
			return 1;
		if(arr[start]==arr[end]){
			dp[start][end] = 2+recurse(arr, dp, start+1,end-1);
		}
		else{
			dp[start][end] = max(recurse(arr,dp,start+1,end),recurse(arr,dp,start,end-1));
		}
		return dp[start][end];
	}
	public Integer max(int a, int b){
		return (a>b)?a:b;
	}
	public void print(Integer[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
