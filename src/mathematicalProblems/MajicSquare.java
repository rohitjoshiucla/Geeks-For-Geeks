package mathematicalProblems;

public class MajicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer dim = 4;
		Integer[][] arr = new Integer[dim][dim];
		MajicSquare obj = new MajicSquare();
		obj.recurse(arr, arr.length/2-1, arr[0].length-1, 1, dim);
		obj.print(arr);
	}
	
	public void recurse(Integer [][]arr, Integer row, Integer col, Integer num, Integer dim){
		if(num<=dim*dim){
			System.out.println("row= "+row+" col= "+col+" num= "+num );
			if(row < 0 && col >= arr[0].length){
				row = 0;
				col = col - 2;
			}
			else if(row < 0){
				row = arr.length-1;
			}
			else if(col >= arr[0].length){
				col = 0;
			}
			if(arr[row][col] != null){
				row = row + 1;
				col = col - 2;
			}
			arr[row][col] = num;
			recurse(arr,row-1,col+1,num+1,dim);
		}
		
	}
	
	public void print(Integer [][] arr){
		for(int row=0; row<arr.length; row++){
			for(int col=0; col<arr[0].length; col++){
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println("");
		}
				
		
	}

}
/*
9 3 22 16 15
2 21 20 14 8
25 19 13 7 1 
18 12 6 5 24
11 10 4 23 17 

2 13 8 7 
12 11 6 1
10 5 4 15 
0 3 14 9

8 3 0 0 
2 0 0 7
0 0 6 1 
0 5 4 0
*/