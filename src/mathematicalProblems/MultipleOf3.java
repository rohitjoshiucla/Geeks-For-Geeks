package mathematicalProblems;

public class MultipleOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = 15;
		MultipleOf3 obj = new MultipleOf3();
		
		System.out.println(obj.evenSetBits(num));
		System.out.println(obj.oddSetBits(num));
		
		Integer diff = obj.evenSetBits(num) - obj.oddSetBits(num);
		
		if(Math.abs(diff)%3==0)
			System.out.println("Divisible");
		else
			System.out.println("Not Divisible");
			
	}
	public Integer evenSetBits(Integer a){
		Integer count = 0;
		for(Integer i=0; i<Integer.SIZE ;i=i+2){
			count = ((a&(1<<i))>0)?count+1:count;
		}
		return count;
	}
	public Integer oddSetBits(Integer a){
		Integer count = 0;
		for(Integer i=1; i<Integer.SIZE ;i=i+2){
			count = ((a&(1<<i))>0)?count+1:count;
		}
		return count;
	}

}
