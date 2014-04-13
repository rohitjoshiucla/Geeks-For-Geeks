package mathematicalProblems;

import java.math.BigDecimal;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 3;
		Integer y = 3;
		Power obj = new Power();
		
		System.out.println(obj.power(x, y));
	}
	
	public BigDecimal power(Integer x, Integer y){
		
		if(y==1)
			return new BigDecimal(x);
		else{
			BigDecimal returnValue = power(x,y/2);
			if(y%2==0)
				return returnValue.pow(2);
			else
				return returnValue.pow(2).multiply(new BigDecimal(x));
		}
			
		
	}

}
