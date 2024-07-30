package javaChallenges;

import week1.day3.VerifyPalindrome;

public class Challenge3_Palindrome {

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.Given a string s, return true if it is a palindrome, or false otherwise.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bOutput = false;
		String sActString = "A man, a plan,  a canal: Panama";
		//String sActString = " ";
		System.out.println("Actual String - " +sActString);
		
		//Fist make all string to lowercase
		String sLower = sActString.toLowerCase();
				
		//remove all the spaces
		String sInput = sLower.replaceAll("[^a-zA-Z0-9]"," ");
		String sInputp = sInput.replace(" ", "");
		String sOutput = verifyPalindrome (sInputp);//method to perform palindrome
		
		System.out.println("Input after convert to lCase and removed specialChar - " + sInputp);
		
		//Compare both string
		if (sInputp.equalsIgnoreCase(sOutput)) {			
			bOutput = true;	
		}
		
		System.out.println("Output After verify whether the input Palindrome or  - "+sOutput);
		System.out.println(bOutput);
	}
	
	public static String verifyPalindrome (String sInputp) {
		
		String sOutput = "";
		//boolean bOutput = false;
		//make the string to array using toCharArray
		char charArr [] = sInputp.toCharArray();
		int ilen = charArr.length;
		
		for (int i=0;i<ilen;i++) {			
			sOutput = charArr[i] + sOutput ;			
		}
		return sOutput;	
	}
}
