package dynamicProgramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "abcd";
		String second = "abbd";
		char[] arr1 = first.toCharArray();
		char[] arr2 = second.toCharArray();
		LongestCommonSubsequence obj = new LongestCommonSubsequence();
		System.out.println(obj.recurse(arr1,arr2, arr1.length-1, arr2.length-1));
	}
	
	public int recurse(char[] arr1, char[] arr2, int m, int n){
		if(m<0 || n<0)
			return 0;
		if(arr1[m]==arr2[n])
			return 1 + recurse(arr1, arr2, m-1, n-1);
		else
			return max(recurse(arr1,arr2,m-1,n),recurse(arr1,arr2,m,n-1));
	}
	
	public int max(int a, int b){
		return (a>b)?a:b;
	}
}
