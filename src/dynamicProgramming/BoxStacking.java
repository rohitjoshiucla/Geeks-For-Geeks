package dynamicProgramming;

public class BoxStacking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[][] base = new Integer[][]{{12,32},{10,32},{10,32},{6,7},{5,6},{4,7},{4,6},{4,6},{4,5},{2,3},{1,3},{1,2}};
		Integer[] height = new Integer[]{10, 12, 32, 4, 4, 6, 5, 7, 6, 1, 2, 3};
		Integer[] dp = new Integer[height.length]; 
		BoxStacking obj = new BoxStacking();
		obj.recurse(base, height, dp, Integer.MAX_VALUE, Integer.MAX_VALUE, height.length);
		obj.print(dp);
	}

	public Integer recurse(Integer[][] base, Integer[] height, Integer[] dp, Integer minLen, Integer minBreadth, Integer n){
				
		if(n==0)
			return 0;
		
		if(base[n-1][0]<minLen && base[n-1][1]<minBreadth){
			if(dp[n-1]!=null)
				return dp[n-1];
			
			dp[n-1] = height[n-1] + recurse(base, height, dp, base[n-1][0], base[n-1][1], n-1);
			return dp[n-1];
		}
		else{
			dp[n-1] = height[n-1] + recurse(base, height, dp, base[n-1][0], base[n-1][1], n-1);
			return recurse(base, height, dp, minLen, minBreadth, n-1);
		}
	}
	public void print(Integer[] arr){
		for(Integer i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
