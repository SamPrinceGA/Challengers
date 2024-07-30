package javaChallenges;

/*Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned. */

//int x = 8;
//int result = Integer.parseInt(Math.sqrt(x));

public class Challenge2 {
		
	public static int findSqureRoot(int input) {
		
		int sQuare = (int) input/2; 
		int z;
		
		
		do {
			z = sQuare; 
			sQuare = (int) (z+(input/z))/2;
			
		} 	while (z!=sQuare);//while ((z - sQuare)!=0);
		
		return (int) sQuare;//*/
		
		
		/*//using inbuilt
		
		int square = (int) Math.sqrt(input);
		return square;*/
	}

	public static void main(String[] args) {
		
		int input = 9;		
		
		if (input<=1) {
			System.out.println("The given no is either 0 or 1 or Negative noumer");			
		} 
		
		if (input>1) {
		
			int y =  findSqureRoot (input);
			System.out.print("Square root of Number "+input+" is ");
			System.out.println(y);
		}
	}

}




