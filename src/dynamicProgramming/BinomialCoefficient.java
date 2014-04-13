package dynamicProgramming;

public class BinomialCoefficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		Integer k = 2;
		Integer[][] dp = new Integer[n+1][k+1];
		BinomialCoefficient obj = new BinomialCoefficient();
		System.out.println(obj.recurse(dp, n, k));
		obj.print(dp);
	}
	
	public Integer recurse(Integer[][] dp, Integer n, Integer k){
		if(k<0 || n<0)
			return 0;
		
		if(dp[n][k]!=null)
			return dp[n][k];
		
		if(k==0||k==n){
			dp[n][k] = 1;
			return 1;
		}
		
		dp[n][k] = recurse(dp, n-1,k-1) + recurse(dp, n-1, k);
		return dp[n][k];
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
