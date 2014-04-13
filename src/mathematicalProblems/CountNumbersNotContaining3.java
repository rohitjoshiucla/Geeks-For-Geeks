package mathematicalProblems;

public class CountNumbersNotContaining3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = 99;
		CountNumbersNotContaining3 obj = new CountNumbersNotContaining3();
		
		System.out.println(obj.recurse(num, 3));
	}
	public Integer recurse(Integer num, Integer numDigits){
		if(num<3)
			return num;
		if(num<=9)
			return num-1;
		Integer msb = num/((int)Math.pow(10, numDigits-1));
		
		if(msb!=3)
			return recurse(msb, -1) * recurse((int)Math.pow(10, numDigits-1)-1, numDigits -1) +
					recurse(msb, -1) + 
					recurse(num%(int)Math.pow(10, numDigits-1), numDigits-1);
		else
			return recurse( msb*(int)Math.pow(10, numDigits-1) -1, numDigits );
	}
	
	

}
/*
123

234

count(2)*count(99)+ count(2) + count(34)


count(3)*count(9) + count(3) + count(4)




*/
/*
3
13
23
30
31
32
33
34
35
36
37
38
39
43
53
63
73
83
93
103
113
123
*/