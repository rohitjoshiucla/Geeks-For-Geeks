package dynamicProgramming;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] wt = new Integer[]{10,20,30};
		Integer[] cost = new Integer[]{60,100,120};
		Integer[] dp = new Integer[wt.length];
		KnapSack obj = new KnapSack();
		obj.recurse(wt, cost, dp, 50, wt.length);
		obj.print(dp);
	}
	
	public Integer recurse(Integer[] wt, Integer[] cost, Integer[] dp, Integer targetWt, Integer n){
		
		if(n==0)
			return 0;
		Integer returnVal;
		if(wt[n-1]>targetWt){
			returnVal = recurse(wt,cost,dp,targetWt,n-1);
		}
		else{
			Integer temp1 = cost[n-1]+recurse(wt,cost,dp,targetWt-wt[n-1],n-1);
			Integer temp2 = recurse(wt,cost,dp,targetWt,n-1);
			returnVal = (temp1>temp2)?temp1:temp2;
		}
		dp[n-1]=returnVal;
		return dp[n-1];
	}
	
	public void print(Integer[] arr){
		for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+"\t");
		}
	}
}
