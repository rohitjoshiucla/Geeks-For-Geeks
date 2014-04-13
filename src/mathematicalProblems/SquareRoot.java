package mathematicalProblems;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 16;
		Double x = (double)n;
		Double y = (double)1;
		while((x-y)>0.01){
			System.out.println(x+" " +y);
				x = (x+y)/2;
				y = n/x;
			
			
		}
		System.out.println(x);
	}

}
/*

	x = 4
	y = 1
	
	x = 2.5
	y = 1.6
	
	
	

*/