package sort;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[]{5,4,3,2,1};
		Bubble obj = new Bubble();
		obj.Sort(arr);
		obj.print(arr);
	}
	public void Sort(Integer[] arr){
		recurse(arr,arr.length-2);
	}
	public void recurse(Integer[] arr, Integer end){
		if(end<0){
			
		}
		else{
			for(Integer i=0; i<=end; i++){
				if(arr[i]>arr[i+1])
					swap(arr,i,i+1);
			}
			
			recurse(arr,end-1);
		}
		
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
