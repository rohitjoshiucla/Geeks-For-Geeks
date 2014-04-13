package dynamicProgramming;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "abcd";
		String second = "abbd";
		char[] arr1 = first.toCharArray();
		char[] arr2 = second.toCharArray();
		
		Integer[][] arr = new Integer[arr1.length+1][arr2.length+1];
		EditDistance obj = new EditDistance();
		obj.initialize(arr);
		obj.recurse(arr, arr.length-1, arr[0].length-1);
		obj.print(arr);
	}
	
	public int recurse(Integer[][] arr, Integer row, Integer col){
		if(arr[row][col]!=null)
			return arr[row][col];
		arr[row][col]= max(1+recurse(arr,row-1,col-1), 1+recurse(arr,row-1,col), 1+recurse(arr,row,col-1));
		return arr[row][col];
	}
	
	public void initialize(Integer[][] arr){
		int temp = -1;
		for(int i=0; i<arr[0].length; i++)
			arr[0][i]=++temp;
		temp = -1;
		for(int i=0; i<arr.length; i++)
			arr[i][0]=++temp;
	}
	public int max(int a, int b, int c){
		int temp = (a>b)?a:b;
		return (temp>c)?temp:c;
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
