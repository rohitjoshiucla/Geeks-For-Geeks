package dynamicProgramming;

public class MinCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] arr = new Integer[][]{
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		Integer[][] dp = new Integer[arr.length][arr[0].length];
		MinCost obj = new MinCost();
		System.out.println(obj.recurse(arr,arr.length-1, arr[0].length-1,dp));
		
		obj.print(dp);
	}
	
	public int recurse(Integer[][] arr,int row, int col, Integer[][] dp){
		if(row==0 && col==0)
			return arr[0][0];
		if(row<0 || col<0)
			return Integer.MAX_VALUE;
		if(dp[row][col]!=null)
			return dp[row][col];
		dp[row][col] =arr[row][col]+ min(
				recurse(arr,row,col-1,dp),
				recurse(arr,row-1,col,dp),
				recurse(arr,row-1,col-1,dp)
				);
		return   dp[row][col];
	}
	
	public int min(int a, int b, int c){
		int temp = (a<b)?a:b;
		return (temp<c)?temp:c;
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
