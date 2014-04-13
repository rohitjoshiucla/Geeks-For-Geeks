package sort;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[]{1,3,5,2,4};
		Merge obj = new Merge();	
		obj.Sort(arr);
		obj.print(arr);
	}
	
	public void Sort(Integer[] arr){
		recurse(arr,0,arr.length-1);
	}
	
	public void recurse(Integer[] arr, Integer start, Integer end){
		
		if((end-start)>=1){
			recurse(arr, start,start+(end-start)/2);
			recurse(arr, 1+ start+(end-start)/2, end);
			Integer[] merged = merge(arr, start, start+(end-start)/2, 1+start+(end-start)/2, end);		
			System.arraycopy(merged, 0, arr, start, merged.length);
		}
	}
	
	public Integer[] merge(Integer[] arr, Integer start1, Integer end1, Integer start2, Integer end2){

		Integer lenArr1 = end1-start1 + 1;
		Integer lenArr2 = end2-start2 + 1;
		
		Integer lenMerged = lenArr1 + lenArr2;		
		Integer[] merged = new Integer[lenMerged];
		
		Integer ptr1 = start1;
		Integer ptr2 = start2;
		
		Integer indexMerged = 0;
		
		Integer start3 = -1;
		Integer end3 = -1;
		
		while(true){
			if(ptr1>end1){
				start3 = ptr2;
				end3 = end2;
				break;
			}
			if(ptr2>end2){
				start3 = ptr1;
				end3 = end1;
				break;
			}
			if(arr[ptr1] <= arr[ptr2]){
				merged[indexMerged] = arr[ptr1];
				ptr1++;
			}
			else{
				merged[indexMerged] = arr[ptr2];
				ptr2++;
			}
			indexMerged++;
		}

		for(int i=start3; i<=end3; i++){
			merged[indexMerged] = arr[start3];
			indexMerged++;
		}
		
		return merged;
	}
	
	public void print(Integer[] arr){
		for(Integer i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n");
	}
	
}
