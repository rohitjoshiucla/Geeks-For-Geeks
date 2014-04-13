package mathematicalProblems;

import java.util.ArrayList;
import java.util.Iterator;

public class PermutationsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "manali";
		PermutationsOfString obj = new PermutationsOfString();
		obj.init(str);
	}
	public void init(String str){
		ArrayList<Character> list = new ArrayList<>();
		char[] arr = str.toCharArray();
		for(Integer i=0; i<arr.length; i++){
			list.add(arr[i]);
		}
		recurse(list, "");
	}
	
	@SuppressWarnings("unchecked")
	public void recurse(ArrayList<Character> list, String str){
		
		if(list.isEmpty()){
			System.out.println(str);
		}
		else{
			Iterator<Character> it = list.iterator();
			while(it.hasNext()){
				ArrayList<Character> cloned = (ArrayList<Character>)list.clone();
				Character c  =it.next();
				cloned.remove(c);
				recurse(cloned,str+c);
			}
			
		}
	}

}
