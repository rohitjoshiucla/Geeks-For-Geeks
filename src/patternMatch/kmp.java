package patternMatch;

public class kmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ababc";
		String word ="ab";
		Integer[] arr = new Integer[str.length()];
		kmp obj = new kmp();
		obj.recurse(arr, 0, str);
		boolean result = obj.recurse(str.toCharArray(), word.toCharArray(), 0, 0, arr, 0);
		System.out.println(result);
		obj.print(arr);
		
	}
	public void recurse(Integer[] arr, Integer index, String str){
		if(index <(str.length()) ){
			if(index==0){
				arr[index]=-1;
			}
			if(index==1){
				arr[index]=0;
			}	
			if(index>1){
				String temp = str.substring(index-1-arr[index-1],index);
				if(str.startsWith(temp))
					arr[index]=arr[index-1]+1;
				else
					arr[index]=0;
			}
			recurse(arr, index+1, str);
		}
		
	}
	
	public void print(Integer[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
	}
	
	public boolean recurse(char[] text, char[] word, Integer m, Integer i, Integer[] skip, Integer level){
		
		if(i>word.length-1)
			return true;
		if(level>text.length-1)
			return false;
		System.out.println("t="+text[m]+" w="+word[i]);
		
		if(text[m]==word[i]){
			return recurse(text,word,m+1,i+1,skip, level+1);
		}
		else{
			i = skip[m+1];
			return recurse(text,word,m+1,i,skip, level+1);
		}
		
	}
	

}
