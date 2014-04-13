package dynamicProgramming;

public class MaxSizeSquareSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] arr =new Integer[][]{
				{0,1,1,0,1},
				{1,1,0,1,0},
				{0,1,1,1,0},
				{1,1,1,1,0},
				{1,1,1,1,1},
				{0,0,0,0,0}
		};
		Integer[][] dp = new Integer[arr.length][arr[0].length];
		MaxSizeSquareSubMatrix obj = new MaxSizeSquareSubMatrix();
		obj.recurse(arr, dp, arr.length, arr[0].length);
		obj.print(dp);
		
	}
	public Integer recurse(Integer[][] arr, Integer[][] dp, Integer row, Integer col){
		if(row<1 || col<1)
			return 0;
		if(dp[row-1][col-1]!=null)
			return dp[row-1][col-1];
		Integer min = min(
				recurse(arr,dp,row-1,col), 
				recurse(arr,dp,row,col-1),
				recurse(arr,dp,row-1,col-1));
		if(arr[row-1][col-1]==1)
			dp[row-1][col-1] = 1 + min;
		else
			dp[row-1][col-1] = 0;
		return dp[row-1][col-1];
	}
	public Integer min(Integer a, Integer b, Integer c){
		Integer min = (a<b)?a:b;
		min = (min<c)?min:c;
		return min;
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
