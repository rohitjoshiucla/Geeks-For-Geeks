package sort;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[]{5,4,3,2,1};
		Selection obj = new Selection();
		obj.sort(arr);
		obj.print(arr);
	}
	public void sort(Integer[] arr){
		recurse(arr,0);
	}
	
	public void recurse(Integer[] arr, Integer start){
		if(start.equals(arr.length)){

		}
		else{
			swap(arr,start,minIndex(arr,start));
			recurse(arr,start+1);
		}
	}
	
	public Integer minIndex(Integer[] arr, Integer start){
		Integer minimum = Integer.MAX_VALUE;
		Integer minIndex = -1;
		for(Integer i=start; i<arr.length; i++){
			if(arr[i]<minimum){
				minimum = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public void swap(Integer[] arr, Integer index1, Integer index2){
		Integer temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public void print(Integer[] arr){
		for(Integer i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
}
