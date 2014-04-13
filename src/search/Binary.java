package search;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] inputArr = new Integer[]{1,2,3,4};
		Integer num2search = new Integer(3);
		
		Binary obj = new Binary();
		System.out.println(obj.Search(inputArr,num2search));
	}
	
	public Integer Search(Integer[] arr, Integer num){
		return recurse(arr, num, 0, arr.length);
	}
	
	public Integer recurse(Integer[] arr, Integer num, Integer left, Integer right){
		if(num==null)
			return -1;
		
		Integer mid = (left+right)/2;
		
		if(arr[mid].equals(num)){
			if(arr[mid-1].equals(num))
				return recurse(arr,num,left,mid);
			else
				return mid;
		}
		else if((right-left)==1)
			return -1;
		else{
			if(arr[mid] < num){
				return recurse(arr,num,mid,right);
			}
			else{
				return recurse(arr,num,left,mid);
			}
		}
	}

}
