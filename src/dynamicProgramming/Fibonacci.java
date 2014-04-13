package dynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = new Integer(5);
		Integer[] arr = new Integer[n];
		Fibonacci obj = new Fibonacci();
		System.out.println(obj.fib(arr, n-1));
		obj.print(arr);
	}
	
	public Integer fib(Integer[] arr, Integer n){
		if(arr[n]!=null)
			return arr[n];
		
		if(n.equals(0)){
			arr[n]=0;
			return 0;
		}
		if(n.equals(1)){
			arr[n]=1;
			return 1;
		}
		
		arr[n]=fib(arr,n-1)+fib(arr,n-2);
		return arr[n];		
	}
	
	public void print(Integer[] arr){
		for(Integer i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	

}
