package dynamicProgramming;

public class MaxSizeRectangleSubMatric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] arr= new Integer[][]{
				{1,Integer.MIN_VALUE,1,1,1},
				{1,1,1,1,1},
				{1,1,Integer.MIN_VALUE,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}
		};
		Integer[][] dp = new Integer[arr.length][2];
		Integer[][] dp1 = new Integer[arr[0].length][arr[0].length];
		MaxSizeRectangleSubMatric obj = new MaxSizeRectangleSubMatric();
		obj.initLongestSequence(arr, dp);
		obj.initMaxRectangleArea(arr, dp, dp1);
		obj.print(dp1);
	}
	
	public void initMaxRectangleArea(Integer[][] arr, Integer[][] dp, Integer[][] dp1){
		Integer[] temp = new Integer[arr.length];
		for(Integer colStart=0; colStart<arr[0].length; colStart++){
			for(Integer colEnd=colStart;colEnd<arr[0].length; colEnd++){
				
				for(Integer row=0; row<arr.length; row++){
					temp[row] =contains(dp, row, colStart, colEnd);
				}
				LongestSeq(temp, dp1, colStart, colEnd);
				
			}
		}
	}
	
	public Integer contains(Integer[][] dp, Integer row, Integer colStart, Integer colEnd){
		if(colStart>=dp[row][0] && colStart <=dp[row][1]){
			if(colEnd>=dp[row][0] && colEnd <=dp[row][1]){
				return colEnd-colStart+1;
			}
			
		}
		return Integer.MIN_VALUE;
	}
	
	
	public void initLongestSequence(Integer[][] arr, Integer[][] dp){
		
		for(Integer row = 0; row<arr.length; row++){
			LongestSequence(arr, dp, row);
		}
	}
	
	public void LongestSequence(Integer[][] arr, Integer[][] dp, Integer row){
		Integer maxSum = 0;		
		Integer tempMaxSum = 0;
		Integer tempColStart = -1;
		for(int col = 0 ; col< arr[0].length; col++){
			tempMaxSum = tempMaxSum + arr[row][col];
			if(tempMaxSum >= 0){
				tempColStart = (tempColStart < 0)?col:tempColStart;
				if(tempMaxSum> maxSum){
					dp[row][0] = tempColStart;
					dp[row][1] = col;
				}
				
			}
			else{
				tempColStart = -1;
				tempMaxSum = 0;
			}
		}
	}
	
	public void LongestSeq(Integer[]arr, Integer[][] dp1, Integer colStart, Integer colEnd){
		Integer maxSum = 0;		
		Integer tempMaxSum = 0;
		Integer tempRowStart = -1;
		Integer tempRowEnd = -1;
		for(int row = 0 ; row< arr.length; row++){
			tempMaxSum = tempMaxSum + arr[row];
			if(tempMaxSum >= 0){
				tempRowStart = (tempRowStart < 0)?row:tempRowStart;
				if(tempMaxSum> maxSum){
					tempRowEnd = row;
					dp1[colStart][colEnd] = (tempRowEnd - tempRowStart + 1)*(colEnd-colStart + 1);
				}
			}
			else{
				tempRowStart = -1;
				tempMaxSum = 0;
			}
		}
	}
	
	public void print(Integer[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	public void print(Integer[] arr){
		for(Integer i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
